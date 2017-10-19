package com.hsnn.datafetch.tasks.token;

import com.hsnn.datafetch.database.service.TskTokenService;
import com.hsnn.datafetch.exception.RequestException;
import com.hsnn.datafetch.util.TaskHandle;
import com.hsnn.datafetch.util.TaskHandleResult;
import com.hsnn.datafetch.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by admin on 2017/8/26.
 */
@Component
public class TokenHandle implements TaskHandle<TokenResponseModel> {

    @Autowired
    private TskTokenService tskTokenService;

//    public TokenHandle(@Autowired TskTokenService tskTokenService) {
//        this.tskTokenService = tskTokenService;
//    }

    @Override
    public TaskHandleResult handle(TokenResponseModel m) {
        String date = m.getData().getLasttime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        tskTokenService.save(m.getData().getToken());
        try {
            TokenUtil.getInstance().setToken(m.getData().getToken(), sdf.parse(date));
            return TaskHandleResult.NO_MORE_DATA;
        } catch (ParseException e) {
            throw new RequestException("获取Token数据异常");
        }
    }
}
