package tasks.project;

import util.TaskHandle;
import util.TaskHandleResult;

/**
 * Created by admin on 2017/8/26.
 */
public class ProjectHandle implements TaskHandle<String> {

    @Override
    public TaskHandleResult handle(String o) {
        System.out.println(o);
        Integer i = Integer.parseInt(o);
        if (i >= 5) {
            return TaskHandleResult.NO_MORE_DATA;
        } else {
            return TaskHandleResult.HAS_MORE_DATA;
        }
    }
}
