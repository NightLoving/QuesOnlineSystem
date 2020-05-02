package project.entity;

import java.io.Serializable;

/**
 * @author yang
 * @date 2020-4-29
 * @description JavaBean，判断题，对应表db_judge_choice
 */
public class JudgeChoice extends Question implements Serializable {
    //题目id
    private Long quesId;
    //题干
    private String question;
    //答案，正确 - A， 错误 - B
    private String answer;

    @Override
    public Long getQuesId() {
        return quesId;
    }

    @Override
    public void setQuesId(Long quesId) {
        this.quesId = quesId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "JudgeChoice{" +
                "quesId=" + quesId +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
