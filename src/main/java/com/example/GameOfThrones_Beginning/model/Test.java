package com.example.GameOfThrones_Beginning.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name="test")
public class Test {

    @Id
    @NotEmpty
    @Column(name="test_id")
    private int test_id;

    @Column(name="description")
    private String description;

    public int getTest_id() {
        return test_id;
    }

    public void setTest_id(int test_id) {
        this.test_id  = test_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @OneToMany(mappedBy="question_id")
    private List<Question> questions;

    public Test(){};

}

