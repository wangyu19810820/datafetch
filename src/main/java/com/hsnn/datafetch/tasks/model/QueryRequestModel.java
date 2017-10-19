package com.hsnn.datafetch.tasks.model;

import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 查询类
 * Created by admin on 2017/6/1.
 */
public class QueryRequestModel {

    protected String title = "";     // 接口有此参数，实际使用中未用到
    protected Date starttime;
    protected Date endtime;
    protected String areaid = "";    // 接口有此参数，实际使用中未用到
    protected int pageindex = 1;

    public QueryRequestModel() {
    }

    public QueryRequestModel(Date starttime, Date endtime, int pageindex) {
        this.starttime = starttime;
        this.endtime = endtime;
        this.pageindex = pageindex;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        if (StringUtils.isEmpty(title)) {
            map.put("title", "");
        } else {
            map.put("title", title);
        }
        if (StringUtils.isEmpty(areaid)) {
            map.put("areaid", "");
        } else {
            map.put("areaid", areaid);
        }
        map.put("pageindex", pageindex);
        if (starttime == null) {
            map.put("starttime", "");
        } else {
            map.put("starttime", df.format(starttime));
        }
        if (endtime == null) {
            map.put("endtime", "");
        } else {
            map.put("endtime", df.format(endtime));
        }
        return map;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public int getPageindex() {
        return pageindex;
    }

    public void setPageindex(int pageindex) {
        this.pageindex = pageindex;
    }

    @Override
    public String toString() {
        return "QueryRequestModel{" +
                "title='" + title + '\'' +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                ", areaid='" + areaid + '\'' +
                ", pageindex='" + pageindex + '\'' +
                '}';
    }

}
