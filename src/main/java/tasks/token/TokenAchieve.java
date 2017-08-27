package tasks.token;

import exception.RequestException;
import retrofit2.Call;
import retrofit2.Response;
import util.Achieve;
import util.RequestUtil;
import util.ResponseModel;

/**
 * Created by admin on 2017/8/26.
 */
public class TokenAchieve implements Achieve {
    protected TokenRequest tokenRequest = RequestUtil.getRequest(TokenRequest.class);

    @Override
    public TokenResponseModel achieve() {
        Call<TokenResponseModel> call = tokenRequest.getToken("HLBH8171", "hsnn123", "20170703210700");
        try {
            Response<TokenResponseModel> response = call.execute();
            if (response.isSuccessful()
                    && response.body() != null
                    && response.body().getResult() == ResponseModel.RESPONSE_SUC) {
                System.out.println(response.body());
                return response.body();
            } else {
                throw new RequestException("获取Token数据异常");
            }
        } catch (Exception e) {
            throw new RequestException("获取Token数据异常");
        }
    }
}
