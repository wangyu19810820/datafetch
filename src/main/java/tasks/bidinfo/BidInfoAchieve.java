package tasks.bidinfo;

import com.google.gson.Gson;
import exception.RequestException;
import retrofit2.Call;
import retrofit2.Response;
import tasks.RequestUtil;
import tasks.model.QueryRequestModel;
import tasks.model.ResponseModel;
import tasks.project.ProjectRequest;
import tasks.project.ProjectResponseModel;
import util.Achieve;
import util.TokenUtil;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 2017/10/16.
 */
public class BidInfoAchieve implements Achieve {
    protected BidInfoRequest bidInfoRequest = RequestUtil.getRequest(BidInfoRequest.class);
    private int page;

    @Override
    public BidInfoResponseModel achieve() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
        Date startTime = null;
        try {
            startTime = dateFormat.parse("2017-05-26T08:42:00");
        } catch (Exception e) {

        }
        QueryRequestModel queryRequestModel = new QueryRequestModel(
                startTime,
                new Date(),
                page);
        Gson gson = new Gson();
        String param = gson.toJson(queryRequestModel.toMap());

        Call<String> call = bidInfoRequest.getProject("20170827210700",
                TokenUtil.getInstance().getToken(),
                param);
        try {
            Response<String> response = call.execute();
            if (response.isSuccessful()) {
                System.out.println(response.body());
                BidInfoResponseModel model = new Gson().fromJson(response.body(), BidInfoResponseModel.class);
                page++;
                return model;
            } else {
                throw new RequestException("获取BidInfo数据异常");
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RequestException("获取BidInfo数据异常");
        }
    }

    @Override
    public void init() {
        page = 1;
    }
}
