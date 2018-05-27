package com.example.connection.database.model;

public class Person {

    private String name;
    private String DOB;
    private String Sex;
    private String BIO;

    public Person(String name, String DOB, String sex, String BIO) {
        this.name = name;
        this.DOB = DOB;
        Sex = sex;
        this.BIO = BIO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getBIO() {
        return BIO;
    }

    public void setBIO(String BIO) {
        this.BIO = BIO;
    }
}
