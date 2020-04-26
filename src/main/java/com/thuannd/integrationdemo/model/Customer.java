package com.thuannd.integrationdemo.model;

import java.io.Serializable;

public class Customer implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private String name;
    private Boolean isVerified;
    private Integer score;

    public Customer() {
    }

    public Customer(String name, Boolean isVerified, Integer score) {
        this.name = name;
        this.isVerified = isVerified;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}