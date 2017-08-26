package tasks.token;

import util.Handle;
import util.TaskHandle;
import util.TaskHandleResult;

/**
 * Created by admin on 2017/8/26.
 */
public class TokenHandle implements TaskHandle<String> {

    @Override
    public TaskHandleResult handle(String o) {
        System.out.println(o);
        return TaskHandleResult.NO_MORE_DATA;
    }
}
