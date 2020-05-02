package project.entity;

import java.io.Serializable;

/**
 * @author yang
 * @date 2020-4-29
 * @description JavaBean，抽象类，对应表db_question
 */
public abstract class Question implements Serializable {
    //题目id
    private Long quesId;
    //题目类型，单选 - 1， 判断 - 2， 解答 - 3， 多选 - 4
    private Integer quesType;
    //科目表id
    private Integer subjectId;
    //是否被删除，是 - 1， 否 - 0
    private Integer isDeleted;
    //困难度，未知 - 0， 简单 - 1， 普通 - 2， 困难 - 3
    private Integer difficulty;

    public Long getQuesId() {
        return quesId;
    }

    public void setQuesId(Long quesId) {
        this.quesId = quesId;
    }

    public Integer getQuesType() {
        return quesType;
    }

    public void setQuesType(Integer quesType) {
        this.quesType = quesType;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Question{" +
                "quesId=" + quesId +
                ", quesType=" + quesType +
                ", subjectId=" + subjectId +
                ", isDeleted=" + isDeleted +
                ", difficulty=" + difficulty +
                '}';
    }
}
