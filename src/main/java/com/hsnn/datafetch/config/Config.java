package com.hsnn.datafetch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.context.WebApplicationContext;
import com.hsnn.datafetch.util.ScheduledTasks;
import com.hsnn.datafetch.util.TaskLoader;


/**
 * Created by admin on 2017/5/28.
 */
@EnableScheduling
@Configuration

//@Import(DBConfig.class)
//@ImportResource({"classpath:task_list.xml"})

////@ImportResource({"classpath:task_list.xml"})
//@PropertySource("classpath:db.properties")

@ImportResource({"classpath:spring-mybatis.xml"})
@PropertySource("classpath:db.properties")
public class Config {

    private WebApplicationContext applicationContext;

    /**
     * 任务计划执行类
     * @return 任务计划执行类
     */
    @Bean
    public ScheduledTasks task() {
        return new ScheduledTasks();
    }

    /**
     * 任务计划载入类
     * @return 任务计划载入类
     */
    @Bean
    public TaskLoader taskLoader() {
        return new TaskLoader();
    }

//    @Bean
//    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//    public GetDataTokenUtil getDataTokenUtil() {
//        return GetDataTokenUtil.getInstance();
//    }
//
//    @Bean
//    public QueryParamUtil getQueryParamUtil() {
//        return new QueryParamUtil();
//    }
//
//    // 目前，这个没有效果，applicationContext是null，在savefileHandler中保存数据信息
//    // spring还是各种玩不转
//    @Bean
//    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//    public GetFilePathUtil getFilePathUtil() {
//        return new GetFilePathUtil(applicationContext);
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = (WebApplicationContext) applicationContext;
//    }
}
