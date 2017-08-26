package tasks.project;

import util.Achieve;

/**
 * Created by admin on 2017/8/26.
 */
public class ProjectAchieve implements Achieve {

    private int page;

    @Override
    public Object achieve() {
        return "" + page++;
    }

    @Override
    public void init() {
        page = 0;
    }
}
