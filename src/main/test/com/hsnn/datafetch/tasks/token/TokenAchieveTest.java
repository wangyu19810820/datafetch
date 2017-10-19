package com.hsnn.datafetch.tasks.token;

import com.hsnn.datafetch.config.Config;
import com.hsnn.datafetch.util.SinglePageDataTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by admin on 2017/10/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class TokenAchieveTest {

    @Autowired
    TokenAchieve tokenAchieve;

    @Autowired
    TokenHandle tokenHandle;

    @Test
    public void test() {
        TokenAchieve tokenAchieve = new TokenAchieve();
        TokenResponseModel model = tokenAchieve.achieve();
        System.out.println(model);
    }

    @Test
    public void test1() {
        SinglePageDataTask task = new SinglePageDataTask(tokenAchieve, tokenHandle);
        task.execute();
    }
}
