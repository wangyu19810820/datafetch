package util;

/**
 * Created by admin on 2017/8/26.
 */
public class MultiPageDataTask extends DataTask {

    public MultiPageDataTask(Achieve achieve, TaskHandle handle) {
        super(achieve, handle);
    }

    @Override
    public void execute() {
        achieve.init();
        while (true) {
            Object data = achieve.achieve();
            if (data == null) {
                break;
            }
            TaskHandleResult result = handle.handle(data);
            if (result == TaskHandleResult.NO_MORE_DATA) {
                break;
            }
        }
    }
}
