package com.github.tobyhs.rxsecretary.android;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class AndroidSchedulerProviderTest {
    @Test
    public void ui() {
        AndroidSchedulerProvider provider = new AndroidSchedulerProvider();
        assertThat(provider.ui(), is(AndroidSchedulers.mainThread()));
    }
}
