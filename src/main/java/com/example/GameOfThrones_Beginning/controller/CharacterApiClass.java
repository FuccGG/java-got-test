package com.example.GameOfThrones_Beginning.controller;

public class CharacterApiClass {

    private String url;
    private String name;
    private String gender;
    private String culture;
    private String born;
    private String died;
    private String[] title;
    private String[] aliases;
    private String father;
    private String mother;
    private String spouse;
    private String[] allegiances;
    private String[] books;
    private String[] povBooks;
    private String[] tvSeries;
    private String[] playedBy;

    public CharacterApiClass(String url, String name, String gender, String culture, String born, String died, String[] title, String[] aliases, String father, String mother, String spouse, String[] allegiances, String[] books, String[] povBooks, String[] tvSeries, String[] playedBy) {
        this.url = url;
        this.name = name;
        this.gender = gender;
        this.culture = culture;
        this.born = born;
        this.died = died;
        this.title = title;
        this.aliases = aliases;
        this.father = father;
        this.mother = mother;
        this.spouse = spouse;
        this.allegiances = allegiances;
        this.books = books;
        this.povBooks = povBooks;
        this.tvSeries = tvSeries;
        this.playedBy = playedBy;
    }

    public CharacterApiClass() {

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getDied() {
        return died;
    }

    public void setDied(String died) {
        this.died = died;
    }

    public String[] getTitle() {
        return title;
    }

    public void setTitle(String[] title) {
        this.title = title;
    }

    public String[] getAliases() {
        return aliases;
    }

    public void setAliases(String[] aliases) {
        this.aliases = aliases;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public String[] getAllegiances() {
        return allegiances;
    }

    public void setAllegiances(String[] allegiances) {
        this.allegiances = allegiances;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public String[] getPlayedBy() {
        return playedBy;
    }

    public void setPlayedBy(String[] playedBy) {
        this.playedBy = playedBy;
    }

    public String[] getPovBooks() {
        return povBooks;
    }

    public void setPovBooks(String[] povBooks) {
        this.povBooks = povBooks;
    }

    public String[] getTvSeries() {
        return tvSeries;
    }

    public void setTvSeries(String[] tvSeries) {
        this.tvSeries = tvSeries;
    }
}
