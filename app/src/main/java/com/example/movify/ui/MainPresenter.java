package com.example.movify.ui;

import android.util.Log;

import com.example.movify.model.MovieResponse;
import com.example.movify.network.NetworkClient;
import com.example.movify.network.NetworkInterface;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

public class MainPresenter implements MainPresenterInterface {

    public static final String TAG = MainPresenter.class.getSimpleName();
    private MainViewInterface mMainViewInterface;

    public MainPresenter(MainViewInterface mainViewInterface) {
        mMainViewInterface = mainViewInterface;
    }


    @Override
    public void getMovies() {

        getObservable().subscribeWith(getObserver());
    }

    public Observable<MovieResponse> getObservable() {
        return NetworkClient.getRetrofit().create(NetworkInterface.class)
                .getMovieList(20, 1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

    }

    public DisposableObserver<MovieResponse> getObserver() {
        return new DisposableObserver<MovieResponse>() {
            @Override
            public void onNext(MovieResponse movieResponse) {
                mMainViewInterface.displayMovies(movieResponse);
            }

            @Override
            public void onError(Throwable e) {
                mMainViewInterface.displayError(e.getMessage());

            }

            @Override
            public void onComplete() {

                Log.e(TAG, "onComplete: ");
            }
        };
    }
}
