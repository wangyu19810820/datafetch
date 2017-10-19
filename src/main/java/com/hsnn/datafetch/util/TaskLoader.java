package com.hsnn.datafetch.util;

import com.hsnn.datafetch.tasks.api.ApiAchieve;
import com.hsnn.datafetch.tasks.api.ApiHandle;
import com.hsnn.datafetch.tasks.project.ProjectAchieve;
import com.hsnn.datafetch.tasks.project.ProjectHandle;
import com.hsnn.datafetch.tasks.token.TokenAchieve;
import com.hsnn.datafetch.tasks.token.TokenHandle;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

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
        Task getApiTask = new SinglePageDataTask(new ApiAchieve(), new ApiHandle());
        Task getProjTask = new MultiPageDataTask(new ProjectAchieve(), new ProjectHandle());

        List<Task> list = new ArrayList<>();
        list.add(getTokenTask);
//        list.add(getApiTask);
        list.add(getProjTask);
        return list;
    }

//    public List<Task> loadTask() {
//        return applicationContext.getBean("taskList", List.class);
//    }
}
