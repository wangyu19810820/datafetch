package database.service;

import database.model.TskToken;

/**
 * Created by admin on 2017/10/16.
 */
public interface TskTokenService {

    TskToken getTskToken();

    void save(String token);
}
