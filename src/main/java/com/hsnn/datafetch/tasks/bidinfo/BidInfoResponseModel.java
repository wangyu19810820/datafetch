package com.hsnn.datafetch.tasks.bidinfo;

import lombok.Data;
import lombok.ToString;
import com.hsnn.datafetch.tasks.model.ContentResponseModel;
import com.hsnn.datafetch.tasks.model.ResponseModel;

import java.util.List;

/**
 * Created by admin on 2017/10/16.
 */
@Data
@ToString(callSuper = true)
public class BidInfoResponseModel extends ResponseModel {
    protected List<BidInfoResponseModel.Data> data;

    @lombok.Data
    class Data {
        private String articleid;
        private String title;
        private String areaid;
        private String areaname;
        private String source;
        private String sourceurl;
        private String publicdate;
//        private String channelid;
        private List<ContentResponseModel> content;
    }
}
