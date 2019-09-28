package com.example.foodwastemanage;

public class Rating {


    private String user_name;
    private Float rate;

    public Rating(String user_name, Float rate) {
        this.user_name = user_name;
        this.rate = rate;
    }
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }



}
