package com.hsnn.datafetch.database;

import com.hsnn.datafetch.config.Config;
import com.hsnn.datafetch.database.model.TskToken;
import com.hsnn.datafetch.database.service.TskTokenService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.hsnn.datafetch.database.dao.TskTokenMapper;
import com.hsnn.datafetch.database.model.TskTokenCriteria;

import java.util.List;

/**
 * Created by admin on 2017/10/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class TskTokenServiceTest {

    @Autowired
    private TskTokenService tskTokenService;

    @Autowired
    private TskTokenMapper mapper;
//    private BpArticleContentMapper contentMapper;

    @Test
    public void testGetTskToken() {
        TskToken tskToken = tskTokenService.getTskToken();
        System.out.println(tskToken);

//        List list = mapper.selectByExample(new TskTokenCriteria());
//        list.forEach(System.out::println);

    }

    @Test
    public void testSave() {
        tskTokenService.save("16844160-5f6c-476d-a677-cdfa3929937f");
    }
}
