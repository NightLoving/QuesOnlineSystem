package project.entity;

import java.io.Serializable;

/**
 * @author yang
 * @date 2020-4-29
 * @description JavaBean，用户选择科目表，对应表db_user_subject
 */
public class UserSubject implements Serializable {
    //用户id
    private Long userId;
    //科目id
    private Integer subjectId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public String toString() {
        return "UserSubject{" +
                "userId=" + userId +
                ", subjectId=" + subjectId +
                '}';
    }
}
