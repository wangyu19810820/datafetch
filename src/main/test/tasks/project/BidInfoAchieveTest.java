package tasks.project;

import config.Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tasks.bidinfo.BidInfoAchieve;
import tasks.bidinfo.BidInfoResponseModel;
import tasks.token.TokenAchieve;
import tasks.token.TokenResponseModel;

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
