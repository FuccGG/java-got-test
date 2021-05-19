package models;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

public class Question {
    @Id
    @NotEmpty
    @Column(name="question_id")
    private int question_id;

    @Column(name="text")
    private String text;

    @Column(name="v1")
    private String v1;

    @Column(name="v2")
    private String v2;

    @ManyToOne
    @JoinColumn(name="question_id", nullable=false)
    private Test test;

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getV1() {
        return v1;
    }

    public void setV1(String v1) {
        this.v1 = v1;
    }

    public String getV2() {
        return v2;
    }

    public void setV2(String v2) {
        this.v2 = v2;
    }


}
