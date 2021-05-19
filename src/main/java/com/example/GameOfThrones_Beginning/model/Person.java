package com.example.GameOfThrones_Beginning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="person")
public class Person {


    @Id
    @NotEmpty
    @Column(name="person_id")
    private int person_id;

    @Column(name="person_info")
    private String person_info;

    @Column(name="person_api_id")
    private int person_api_id;

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getPerson_info() {
        return person_info;
    }

    public void setPerson_info(String person_info) {
        this.person_info = person_info;
    }

    public int getPerson_api_id() {
        return person_api_id;
    }

    public void setPerson_api_id(int person_api_id) {
        this.person_api_id = person_api_id;
    }

    public Person(){};
}
