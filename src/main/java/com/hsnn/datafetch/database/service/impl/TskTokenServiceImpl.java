package com.hsnn.datafetch.database.service.impl;

import com.hsnn.datafetch.database.dao.TskTokenMapper;
import com.hsnn.datafetch.database.service.TskTokenService;
import com.hsnn.datafetch.database.model.TskToken;
import com.hsnn.datafetch.database.model.TskTokenCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2017/10/16.
 */
@Service
public class TskTokenServiceImpl implements TskTokenService {

    @Autowired
    private TskTokenMapper tskTokenMapper;

    @Override
    public TskToken getTskToken() {
        TskTokenCriteria criteria = new TskTokenCriteria();
        criteria.createCriteria();
        List<TskToken> list = tskTokenMapper.selectByExample(criteria);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public void save(String token) {
        TskToken tskToken = getTskToken();
        if (tskToken == null) {
            tskToken = new TskToken();
            tskToken.setDatetime(new Date());
            tskToken.setToken(token);
            tskTokenMapper.insert(tskToken);
        } else {
            tskToken.setDatetime(new Date());
            tskToken.setToken(token);
            tskTokenMapper.updateByExample(tskToken, new TskTokenCriteria());
        }
    }
}
