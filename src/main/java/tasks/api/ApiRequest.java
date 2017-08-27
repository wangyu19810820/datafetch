package tasks.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by admin on 2017/7/11.
 */
public interface ApiRequest {

    @GET("getapilist")
    Call<ApiResponseModel> getApi(
            @Query("userid") String username,
            @Query("password") String password,
            @Query("transtime") String transtime);
}
