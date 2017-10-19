package com.hsnn.datafetch.tasks.api;

import com.hsnn.datafetch.exception.RequestException;
import retrofit2.Call;
import retrofit2.Response;
import com.hsnn.datafetch.util.Achieve;
import com.hsnn.datafetch.tasks.RequestUtil;
import com.hsnn.datafetch.tasks.model.ResponseModel;

/**
 * Created by admin on 2017/8/26.
 */
public class ApiAchieve implements Achieve {
    protected ApiRequest apiRequest = RequestUtil.getRequest(ApiRequest.class);

    @Override
    public ApiResponseModel achieve() {
        Call<ApiResponseModel> call = apiRequest.getApi("HLBH8171", "hsnn123", "20170703210700");
        try {
            Response<ApiResponseModel> response = call.execute();
            if (response.isSuccessful()
                    && response.body() != null
                    && response.body().getResult() == ResponseModel.RESPONSE_SUC) {
                System.out.println(response.body());
                return response.body();
            } else {
                throw new RequestException("获取Api数据异常");
            }
        } catch (Exception e) {
            throw new RequestException("获取Api数据异常");
        }
    }
}
