package project.entity;

import java.io.Serializable;

/**
 * @author yang
 * @date 2020-4-29
 * @description JavaBean，科目，对应表db_subject
 */
public class Subject implements Serializable {
    //科目id
    private Integer subjectId;
    //科目名字
    private String subjectName;

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
