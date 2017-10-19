package com.hsnn.datafetch.tasks.project;

import com.hsnn.datafetch.config.Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.hsnn.datafetch.tasks.bidinfo.BidInfoAchieve;
import com.hsnn.datafetch.tasks.bidinfo.BidInfoResponseModel;

/**
 * Created by admin on 2017/10/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class BidInfoAchieveTest {

    @Test
    public void test() {
        BidInfoAchieve tokenAchieve = new BidInfoAchieve();
        BidInfoResponseModel model = tokenAchieve.achieve();
        System.out.println(model);
    }
}
