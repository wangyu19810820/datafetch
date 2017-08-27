package tasks.project;

import tasks.model.ContentResponseModel;
import tasks.model.ProgressResponseModel;
import tasks.model.ResponseModel;
import tasks.token.TokenResponseModel;

import java.util.List;

/**
 * Created by admin on 2017/8/27.
 */
public class ProjectResponseModel extends ResponseModel {

    protected List<ProjectResponseModel.Data> data;

    public List<ProjectResponseModel.Data> getData() {
        return data;
    }

    public void setData(List<ProjectResponseModel.Data> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ProjectResponseModel{" +
                "data='" + data + '\'' +
                "} " + super.toString();
    }

    class Data {
        private String articleid;
        private String title;
        private String areaid;
        private String areaname;
        private String source;
        private String sourceurl;
        private String publicdate;
        private String channelid;
        private String ProjectStatus;
        private List<ContentResponseModel> content;
        private List<ProjectStart> ProjectStartTime;
        private List<ProgressResponseModel> Progress;

        public String getArticleid() {
            return articleid;
        }

        public void setArticleid(String articleid) {
            this.articleid = articleid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAreaid() {
            return areaid;
        }

        public void setAreaid(String areaid) {
            this.areaid = areaid;
        }

        public String getAreaname() {
            return areaname;
        }

        public void setAreaname(String areaname) {
            this.areaname = areaname;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getSourceurl() {
            return sourceurl;
        }

        public void setSourceurl(String sourceurl) {
            this.sourceurl = sourceurl;
        }

        public String getPublicdate() {
            return publicdate;
        }

        public void setPublicdate(String publicdate) {
            this.publicdate = publicdate;
        }

        public String getChannelid() {
            return channelid;
        }

        public void setChannelid(String channelid) {
            this.channelid = channelid;
        }

        public String getProjectStatus() {
            return ProjectStatus;
        }

        public void setProjectStatus(String projectStatus) {
            ProjectStatus = projectStatus;
        }

        public List<ContentResponseModel> getContent() {
            return content;
        }

        public void setContent(List<ContentResponseModel> content) {
            this.content = content;
        }

        public List<ProjectStart> getProjectStartTime() {
            return ProjectStartTime;
        }

        public void setProjectStartTime(List<ProjectStart> projectStartTime) {
            ProjectStartTime = projectStartTime;
        }

        public List<ProgressResponseModel> getProgress() {
            return Progress;
        }

        public void setProgress(List<ProgressResponseModel> progress) {
            Progress = progress;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "articleid='" + articleid + '\'' +
                    ", title='" + title + '\'' +
                    ", areaid='" + areaid + '\'' +
                    ", areaname='" + areaname + '\'' +
                    ", source='" + source + '\'' +
                    ", sourceurl='" + sourceurl + '\'' +
                    ", publicdate='" + publicdate + '\'' +
                    ", channelid='" + channelid + '\'' +
                    ", ProjectStatus='" + ProjectStatus + '\'' +
                    ", content=" + content +
                    ", ProjectStartTime=" + ProjectStartTime +
                    ", Progress=" + Progress +
                    '}';
        }
    }

    class ProjectStart {
        private String ProjectStartTime;
        private String ProjectEndTime;
        private String ProjectPhase;
        private String ProjectType;
        private String ProjectYear;
        private String BidOpenTime;
        private String WinTime;
        private String PurchaseStartTime;
        private String PurchaseEndTime;
        private String ProjectAbbreviation;

        public String getProjectStartTime() {
            return ProjectStartTime;
        }

        public void setProjectStartTime(String projectStartTime) {
            ProjectStartTime = projectStartTime;
        }

        public String getProjectEndTime() {
            return ProjectEndTime;
        }

        public void setProjectEndTime(String projectEndTime) {
            ProjectEndTime = projectEndTime;
        }

        public String getProjectPhase() {
            return ProjectPhase;
        }

        public void setProjectPhase(String projectPhase) {
            ProjectPhase = projectPhase;
        }

        public String getProjectType() {
            return ProjectType;
        }

        public void setProjectType(String projectType) {
            ProjectType = projectType;
        }

        public String getProjectYear() {
            return ProjectYear;
        }

        public void setProjectYear(String projectYear) {
            ProjectYear = projectYear;
        }

        public String getBidOpenTime() {
            return BidOpenTime;
        }

        public void setBidOpenTime(String bidOpenTime) {
            BidOpenTime = bidOpenTime;
        }

        public String getWinTime() {
            return WinTime;
        }

        public void setWinTime(String winTime) {
            WinTime = winTime;
        }

        public String getPurchaseStartTime() {
            return PurchaseStartTime;
        }

        public void setPurchaseStartTime(String purchaseStartTime) {
            PurchaseStartTime = purchaseStartTime;
        }

        public String getPurchaseEndTime() {
            return PurchaseEndTime;
        }

        public void setPurchaseEndTime(String purchaseEndTime) {
            PurchaseEndTime = purchaseEndTime;
        }

        public String getProjectAbbreviation() {
            return ProjectAbbreviation;
        }

        public void setProjectAbbreviation(String projectAbbreviation) {
            ProjectAbbreviation = projectAbbreviation;
        }

        @Override
        public String toString() {
            return "ProjectStart{" +
                    "ProjectStartTime='" + ProjectStartTime + '\'' +
                    ", ProjectEndTime='" + ProjectEndTime + '\'' +
                    ", ProjectPhase='" + ProjectPhase + '\'' +
                    ", ProjectType='" + ProjectType + '\'' +
                    ", ProjectYear='" + ProjectYear + '\'' +
                    ", BidOpenTime='" + BidOpenTime + '\'' +
                    ", WinTime='" + WinTime + '\'' +
                    ", PurchaseStartTime='" + PurchaseStartTime + '\'' +
                    ", PurchaseEndTime='" + PurchaseEndTime + '\'' +
                    ", ProjectAbbreviation='" + ProjectAbbreviation + '\'' +
                    '}';
        }
    }
}
