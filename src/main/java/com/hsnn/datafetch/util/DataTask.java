package com.hsnn.datafetch.util;

/**
 * Created by admin on 2017/8/26.
 */
public abstract class DataTask<T> implements Task {
    protected Achieve achieve;
    protected TaskHandle<T> handle;

    public DataTask(Achieve achieve, TaskHandle<T> handle) {
        this.achieve = achieve;
        this.handle = handle;
    }
}
