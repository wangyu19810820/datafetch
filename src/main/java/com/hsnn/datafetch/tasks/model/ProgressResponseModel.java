package com.hsnn.datafetch.tasks.model;

/**
 * Created by admin on 2017/8/27.
 */
public class ProgressResponseModel {

    private String Progress;
    private String StartTime;
    private String EndTime;
    private String Remark;

    public String getProgress() {
        return Progress;
    }

    public void setProgress(String progress) {
        Progress = progress;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    @Override
    public String toString() {
        return "ProgressResponseModel{" +
                "Progress='" + Progress + '\'' +
                ", StartTime='" + StartTime + '\'' +
                ", EndTime='" + EndTime + '\'' +
                ", Remark='" + Remark + '\'' +
                '}';
    }
}
