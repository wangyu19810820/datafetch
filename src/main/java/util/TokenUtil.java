package util;

import java.util.Date;

/**
 * Created by admin on 2017/5/31.
 */
public class TokenUtil {

//    @Autowired
//    private TokenModelRepository repository;

    private static TokenUtil instance = new TokenUtil();
    private String token;

    private TokenUtil(){}

    public static TokenUtil getInstance() {
        return instance;
    }

    public synchronized String getToken() {
//        if (tokenModel == null) {
//            // 从数据库中取token
//            tokenModel = repository.getTokenModel();
//        }
        return token;
    }

    public synchronized void setToken(String token, Date date) {
        System.out.println(token);
        System.out.println(date);
        this.token = token;
    }

}
