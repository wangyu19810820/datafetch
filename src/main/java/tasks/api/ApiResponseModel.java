package tasks.api;

import tasks.model.ResponseModel;

import java.util.List;

/**
 * Created by admin on 2017/8/27.
 */
public class ApiResponseModel extends ResponseModel {

    protected List<Data> data;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApiResponseModel{" +
                "data='" + data.toString() + '\'' +
                "} " + super.toString();
    }

    class Data {
        private String apicode;
        private String apiname;
        private String apides;

        public String getApicode() {
            return apicode;
        }

        public void setApicode(String apicode) {
            this.apicode = apicode;
        }

        public String getApiname() {
            return apiname;
        }

        public void setApiname(String apiname) {
            this.apiname = apiname;
        }

        public String getApides() {
            return apides;
        }

        public void setApides(String apides) {
            this.apides = apides;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "apicode='" + apicode + '\'' +
                    ", apiname='" + apiname + '\'' +
                    ", apides='" + apides + '\'' +
                    '}';
        }
    }
}
