package com.micky.commonproj.presenter.impl;

import com.micky.commonlib.utils.RxUtils;
import com.micky.commonproj.presenter.BasePresenter;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;


public class BasePresenterImpl implements BasePresenter {
    protected CompositeSubscription mSubscriptions = new CompositeSubscription();

    @Override
    public void onCreate() {
        mSubscriptions = RxUtils.getNewCompositeSubIfUnsubscribed(mSubscriptions);
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onDestroy() {
        mSubscriptions.unsubscribe();
    }

    protected  <T> Observable.Transformer<T, T> applyScheduler() {
        return new Observable.Transformer<T, T>() {
            @Override
            public Observable<T> call(Observable<T> observable) {
                return observable.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }
}
