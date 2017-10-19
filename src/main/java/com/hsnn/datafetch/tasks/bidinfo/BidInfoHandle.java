package com.hsnn.datafetch.tasks.bidinfo;

import com.hsnn.datafetch.tasks.project.ProjectResponseModel;
import com.hsnn.datafetch.util.TaskHandle;
import com.hsnn.datafetch.util.TaskHandleResult;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2017/10/19.
 */
@Component
public class BidInfoHandle implements TaskHandle<BidInfoResponseModel> {

    @Override
    public TaskHandleResult handle(BidInfoResponseModel o) {
        System.out.println(o);

        if (o.getNextpage() == 0) {
            return TaskHandleResult.NO_MORE_DATA;
        } else {
            return TaskHandleResult.HAS_MORE_DATA;
        }
    }
}
