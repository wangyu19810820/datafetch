package util;

/**
 * Created by admin on 2017/8/26.
 */
public class SinglePageDataTask extends DataTask {

    public SinglePageDataTask(Achieve achieve, TaskHandle handle) {
        super(achieve, handle);
    }

    @Override
    public void execute() {
        Object data = achieve.achieve();
        handle.handle(data);
    }
}
