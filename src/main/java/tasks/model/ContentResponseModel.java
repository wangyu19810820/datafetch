package tasks.model;

/**
 * Created by admin on 2017/8/27.
 */
public class ContentResponseModel {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ContentResponseModel{" +
                "content='" + content + '\'' +
                '}';
    }
}
