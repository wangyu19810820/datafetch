package tasks.bidinfo;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by admin on 2017/10/16.
 */
public interface BidInfoRequest {

    @POST("getinformation/bidinfo")
    @FormUrlEncoded
    Call<String> getProject(
            @Query("transtime") String transtime,
            @Query("token") String token,
            @Field(value = "data", encoded = true) String data);
}
