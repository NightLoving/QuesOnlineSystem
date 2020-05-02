package project.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yang
 * @date 2020-4-29
 * @description JavaBean，通知，对应表db_notice
 */
public class Notice implements Serializable {
    //通知id号
    private Integer noticeId;
    //创建时间
    @JsonFormat(pattern = "yy-MM-dd", timezone = "GMT+8")
    private Date createDate;
    //通知内容
    private String content;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "noticeId=" + noticeId +
                ", createDate=" + createDate +
                ", content='" + content + '\'' +
                '}';
    }
}
