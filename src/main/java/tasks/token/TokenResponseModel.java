package tasks.token;

import tasks.model.ResponseModel;

/**
 * Created by admin on 2017/8/27.
 */
public class TokenResponseModel extends ResponseModel {

    protected Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TokenResponseModel{" +
                "data='" + data + '\'' +
                "} " + super.toString();
    }

    class Data {
        private String token;
        private String lastip;
        private String lasttime;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getLastip() {
            return lastip;
        }

        public void setLastip(String lastip) {
            this.lastip = lastip;
        }

        public String getLasttime() {
            return lasttime;
        }

        public void setLasttime(String lasttime) {
            this.lasttime = lasttime;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "token='" + token + '\'' +
                    ", lastip='" + lastip + '\'' +
                    ", lasttime='" + lasttime + '\'' +
                    '}';
        }
    }
}
