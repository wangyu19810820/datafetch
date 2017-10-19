package com.hsnn.datafetch.util;

/**
 * Created by admin on 2017/8/26.
 */
public interface TaskHandle<T> extends Handle<T, TaskHandleResult> {

    @Override
    TaskHandleResult handle(T o);
}
