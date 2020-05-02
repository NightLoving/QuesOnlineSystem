package project.entity;

import java.io.Serializable;

/**
 * @author yang
 * @date 2020-4-29
 * @description JavaBean，用户，对应表db_user
 */
public class User implements Serializable {
    //用户id
    private Long userId;
    //用户名
    private String username;
    //密码
    private String password;
    //正确题数
    private Integer rightNumber;
    //做题总数
    private Integer totalNumber;
    //用户积分
    private Integer points;
    //用户Token
    private String userToken;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRightNumber() {
        return rightNumber;
    }

    public void setRightNumber(Integer rightNumber) {
        this.rightNumber = rightNumber;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rightNumber=" + rightNumber +
                ", totalNumber=" + totalNumber +
                ", points=" + points +
                ", userToken='" + userToken + '\'' +
                '}';
    }
}
