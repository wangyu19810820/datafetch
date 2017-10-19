package com.hsnn.datafetch.tasks.api;

import com.hsnn.datafetch.util.TaskHandle;
import com.hsnn.datafetch.util.TaskHandleResult;

/**
 * Created by admin on 2017/8/26.
 */
public class ApiHandle implements TaskHandle<ApiResponseModel> {

    @Override
    public TaskHandleResult handle(ApiResponseModel o) {
        System.out.println(o.getData());
        return TaskHandleResult.NO_MORE_DATA;
    }
}
