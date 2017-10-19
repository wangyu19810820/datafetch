package com.hsnn.datafetch.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Iterator;

/**
 * Created by admin on 2017/5/28.
 */
@Component
public class ScheduledTasks {

    @Autowired
    private TaskLoader taskLoader;

    private Iterator<Task> iterator;

//    @Scheduled(fixedDelay = 50000)
    @Scheduled(cron = "0 0/1 * * * ?")
    public void reportCurrentTime() {
        for (Task task : taskLoader.loadTask()) {
            task.execute();
        }
    }

}
