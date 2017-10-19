package tasks.token;

import lombok.Data;
import lombok.ToString;
import tasks.model.ResponseModel;

/**
 * Created by admin on 2017/8/27.
 */
@Data()
@ToString(callSuper = true)
public class TokenResponseModel extends ResponseModel {

    protected Data data;

    @lombok.Data
    class Data {
        private String token;
        private String lastip;
        private String lasttime;
    }

}
