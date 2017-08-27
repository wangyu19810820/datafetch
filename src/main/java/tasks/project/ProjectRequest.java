package tasks.project;

import retrofit2.Call;
import retrofit2.http.*;
import tasks.model.ResponseModel;

/**
 * Created by admin on 2017/8/27.
 */
public interface ProjectRequest {
    @POST("getinformation/project")
    @FormUrlEncoded
    Call<String> getProject(
            @Query("transtime") String transtime,
            @Query("token") String token,
            @Field(value = "data", encoded = true) String data);
}
