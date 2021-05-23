package models;

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

    private int Q1_id;

    private int Q2_id;

    private int Q3_id;

    private int Q4_id;

    public int getQ1_id() {
        return Q1_id;
    }

    public void setQ1_id(int q1_id) {
        Q1_id = q1_id;
    }

    public int getQ2_id() {
        return Q2_id;
    }

    public void setQ2_id(int q2_id) {
        Q2_id = q2_id;
    }

    public int getQ3_id() {
        return Q3_id;
    }

    public void setQ3_id(int q3_id) {
        Q3_id = q3_id;
    }

    public int getQ4_id() {
        return Q4_id;
    }

    public void setQ4_id(int q4_id) {
        Q4_id = q4_id;
    }



    public Test(){};

}

