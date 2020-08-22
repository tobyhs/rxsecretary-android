package com.github.tobyhs.rxsecretary.android;

import com.github.tobyhs.rxsecretary.BaseSchedulerProvider;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;

/**
 * An <a href="https://github.com/tobyhs/rxsecretary">RxSecretary</a> SchedulerProvider for Android
 * applications
 */
public class AndroidSchedulerProvider extends BaseSchedulerProvider {
    @Override
    public Scheduler ui() {
        return AndroidSchedulers.mainThread();
    }
}
