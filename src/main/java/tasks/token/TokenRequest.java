package tasks.token;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by admin on 2017/7/11.
 */
public interface TokenRequest {

    @GET("gettoken")
    Call<String> getToken(
            @Query("userid") String username,
            @Query("password") String password,
            @Query("transtime") String transtime);
}
