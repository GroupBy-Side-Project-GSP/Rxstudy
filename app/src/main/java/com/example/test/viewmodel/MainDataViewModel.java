package com.example.test.viewmodel;

import androidx.lifecycle.MutableLiveData;

import com.example.test.model.MainData;
import com.example.test.model.MainDataService;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;

public class MainDataViewModel {
    public MutableLiveData<ArrayList<MainData>> maindata = new MutableLiveData<>();
    public MutableLiveData<Boolean> loading = new MutableLiveData<>();
    public MainDataService mainDataService = MainDataService.getInstance();
    private CompositeDisposable disposable = new CompositeDisposable();


    public void refresh() {
        fech();
    }
    private void fech(){
        disposable.add(
                mainDataService.getMainData()
                .subscribeOn(Scheduler.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(
                        new DisposableSingleObserver<List<MainData>>(){

                        }
                )
                        )
        )

    }

}
