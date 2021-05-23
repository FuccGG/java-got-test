package com.example.GameOfThrones_Beginning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="title")
public class Title {


    @Id
    @NotEmpty
    @Column(name="title_id")
    private int title_id;

    @Column(name="title_info")
    private String title_info;

    public String getTitle_info() {
        return title_info;
    }

    public int getTitle_id() {
        return title_id;
    }

    public void setTitle_id(int title_id) {
        this.title_id = title_id;
    }

    public void setTitle_info(String title_info) {
        this.title_info = title_info;
    }

    public Title(){};
}
