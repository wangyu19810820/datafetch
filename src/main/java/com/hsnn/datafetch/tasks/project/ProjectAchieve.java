package com.hsnn.datafetch.tasks.project;

import com.google.gson.Gson;
import com.hsnn.datafetch.exception.RequestException;
import retrofit2.Call;
import retrofit2.Response;
import com.hsnn.datafetch.tasks.RequestUtil;
import com.hsnn.datafetch.tasks.model.QueryRequestModel;
import com.hsnn.datafetch.tasks.model.ResponseModel;
import com.hsnn.datafetch.util.Achieve;
import com.hsnn.datafetch.util.TokenUtil;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 2017/8/26.
 */
public class ProjectAchieve implements Achieve {
    protected ProjectRequest projectRequest = RequestUtil.getRequest(ProjectRequest.class);

    private int page;

    @Override
    public Object achieve() {
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

        Call<String> call = projectRequest.getProject("20170827210700",
                TokenUtil.getInstance().getToken(),
                param);
        try {
            Response<String> response = call.execute();
            if (response.isSuccessful()) {
                System.out.println(response.body());
                Gson gson1 = new Gson();
                ResponseModel dataModel = gson1.fromJson(response.body(), ResponseModel.class);

                ProjectResponseModel model = new Gson().fromJson(response.body(), ProjectResponseModel.class);
                page++;
                return response.body();
            } else {
                throw new RequestException("获取Project数据异常");
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RequestException("获取Project数据异常");
        }
    }

    @Override
    public void init() {
        page = 1;
    }
}
