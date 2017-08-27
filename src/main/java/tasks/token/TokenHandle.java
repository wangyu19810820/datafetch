package tasks.token;

import exception.RequestException;
import util.Handle;
import util.TaskHandle;
import util.TaskHandleResult;
import util.TokenUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by admin on 2017/8/26.
 */
public class TokenHandle implements TaskHandle<TokenResponseModel> {

    @Override
    public TaskHandleResult handle(TokenResponseModel m) {
        String date = m.getData().getLasttime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        try {
            TokenUtil.getInstance().setToken(m.getData().getToken(), sdf.parse(date));
            return TaskHandleResult.NO_MORE_DATA;
        } catch (ParseException e) {
            throw new RequestException("获取Token数据异常");
        }
    }
}
