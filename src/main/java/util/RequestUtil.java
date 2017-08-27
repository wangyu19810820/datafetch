package util;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
//import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by admin on 2017/7/11.
 */

public class RequestUtil {
    private static Retrofit retrofit;
    static {
        retrofit = new Retrofit.Builder()
//                .baseUrl("http://124.115.170.195:8008/")
                .baseUrl("http://192.168.1.2:9006/api/yldata/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static <T> T getRequest(Class<T> t) {
        return retrofit.create(t);
    }
}
