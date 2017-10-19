package com.hsnn.datafetch.tasks.model;

/**
 * 接口返回的数据模型
 * Created by admin on 2017/5/31.
 */
public class ResponseModel {
    public static int RESPONSE_FAIL = 0;
    public static int RESPONSE_SUC = 1;

    protected int result;
    protected String errorcode;
    protected String message;
    protected Object attach;
    protected int pageindex;
    protected int nextpage;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPageindex() {
        return pageindex;
    }

    public void setPageindex(int pageindex) {
        this.pageindex = pageindex;
    }

    public int getNextpage() {
        return nextpage;
    }

    public void setNextpage(int nextpage) {
        this.nextpage = nextpage;
    }

    public Object getAttach() {
        return attach;
    }

    public void setAttach(Object attach) {
        this.attach = attach;
    }

    @Override
    public String toString() {
        return "ResponseModel{" +
                "result=" + result +
                ", errorcode='" + errorcode + '\'' +
                ", message='" + message + '\'' +
                ", attach=" + attach +
                ", pageindex=" + pageindex +
                ", nextpage=" + nextpage +
                '}';
    }
}
