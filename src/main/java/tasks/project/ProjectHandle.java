package tasks.project;

import util.TaskHandle;
import util.TaskHandleResult;

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
