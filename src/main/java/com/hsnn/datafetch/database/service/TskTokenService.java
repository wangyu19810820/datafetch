package com.hsnn.datafetch.database.service;

import com.hsnn.datafetch.database.model.TskToken;

/**
 * Created by admin on 2017/10/16.
 */
public interface TskTokenService {

    TskToken getTskToken();

    void save(String token);
}
