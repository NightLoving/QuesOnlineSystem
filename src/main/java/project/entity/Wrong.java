package project.entity;

import java.io.Serializable;

/**
 * @author yang
 * @date 2020-4-29
 * @description JavaBean，错题表，对应表db_wrong
 */
public class Wrong implements Serializable {
    //问题id
    private Long quesId;
    //用户id
    private Long userId;
    //用户错误答案
    private String userChoice;

    public Long getQuesId() {
        return quesId;
    }

    public void setQuesId(Long quesId) {
        this.quesId = quesId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserChoice() {
        return userChoice;
    }

    public void setUserChoice(String userChoice) {
        this.userChoice = userChoice;
    }

    @Override
    public String toString() {
        return "Wrong{" +
                "quesId=" + quesId +
                ", userId=" + userId +
                ", userChoice='" + userChoice + '\'' +
                '}';
    }
}
