package com.example.GameOfThrones_Beginning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="question")
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

    public Question(){};
}
