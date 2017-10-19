package com.hsnn.datafetch.tasks.project;

import com.hsnn.datafetch.util.TaskHandle;
import com.hsnn.datafetch.util.TaskHandleResult;

/**
 * Created by admin on 2017/8/26.
 */
public class ProjectHandle implements TaskHandle<ProjectResponseModel> {

    @Override
    public TaskHandleResult handle(ProjectResponseModel o) {
        System.out.println(o);

        if (o.getNextpage() == 0) {
            return TaskHandleResult.NO_MORE_DATA;
        } else {
            return TaskHandleResult.HAS_MORE_DATA;
        }
    }
}
