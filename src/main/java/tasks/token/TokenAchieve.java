package tasks.token;

import com.google.gson.Gson;
import exception.RequestException;
import retrofit2.Call;
import retrofit2.Response;
import util.Achieve;
import tasks.RequestUtil;
import tasks.model.ResponseModel;

/**
 * Created by admin on 2017/8/26.
 */
public class TokenAchieve implements Achieve {
    protected TokenRequest tokenRequest = RequestUtil.getRequest(TokenRequest.class);

    @Override
    public TokenResponseModel achieve() {
        Call<String> call = tokenRequest.getToken("HLBH8171", "hsnn123", "20170703210700");
        try {
            Response<String> response = call.execute();
            if (response.isSuccessful()) {
                TokenResponseModel model = new Gson().fromJson(response.body(), TokenResponseModel.class);
                return model;
            } else {
                throw new RequestException("获取Token数据异常");
            }
        } catch (Exception e) {
            throw new RequestException("获取Token数据异常");
        }
    }
}
