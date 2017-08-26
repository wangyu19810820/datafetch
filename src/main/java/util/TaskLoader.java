package util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import tasks.project.ProjectAchieve;
import tasks.project.ProjectHandle;
import tasks.token.TokenAchieve;
import tasks.token.TokenHandle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/5/28.
 */
@Component
public class TaskLoader implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public List<Task> loadTask() {
        Task getTokenTask = new SinglePageDataTask(new TokenAchieve(), new TokenHandle());
        Task getProjTask = new MultiPageDataTask(new ProjectAchieve(), new ProjectHandle());

        List<Task> list = new ArrayList<>();
        list.add(getTokenTask);
        list.add(getProjTask);
        return list;
    }

//    public List<Task> loadTask() {
//        return applicationContext.getBean("taskList", List.class);
//    }
}
