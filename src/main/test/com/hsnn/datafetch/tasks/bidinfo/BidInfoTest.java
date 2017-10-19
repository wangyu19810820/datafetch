package com.hsnn.datafetch.tasks.bidinfo;

import com.hsnn.datafetch.config.Config;
import com.hsnn.datafetch.util.MultiPageDataTask;
import com.hsnn.datafetch.util.SinglePageDataTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by admin on 2017/10/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class BidInfoTest {

    @Autowired
    BidInfoAchieve bidInfoAchieve;

    @Autowired
    BidInfoHandle bidInfoHandle;

    @Test
    public void testAchieve() {
        BidInfoAchieve tokenAchieve = new BidInfoAchieve();
        BidInfoResponseModel model = tokenAchieve.achieve();
        System.out.println(model);
    }

    @Test
    public void testSinglePageDataTask() {
        SinglePageDataTask task = new SinglePageDataTask(bidInfoAchieve, bidInfoHandle);
        task.execute();
    }

    @Test
    public void testMultiPageDataTask() {
        MultiPageDataTask task = new MultiPageDataTask(bidInfoAchieve, bidInfoHandle);
        task.execute();
    }
}
