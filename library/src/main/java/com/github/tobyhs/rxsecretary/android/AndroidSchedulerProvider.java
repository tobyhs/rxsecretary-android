package com.github.tobyhs.rxsecretary.android;

import com.github.tobyhs.rxsecretary.BaseSchedulerProvider;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;

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
