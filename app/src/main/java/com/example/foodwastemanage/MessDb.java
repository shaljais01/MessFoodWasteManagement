package com.example.foodwastemanage;

import java.sql.Timestamp;

public class MessDb {
    private String userName;
    private Integer ngoGravy;
    private Integer ngoBread;
    private Integer animalFood;
    private Timestamp time;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getNgoGravy() {
        return ngoGravy;
    }

    public void setNgoGravy(Integer ngoGravy) {
        this.ngoGravy = ngoGravy;
    }

    public Integer getNgoBread() {
        return ngoBread;
    }

    public void setNgoBread(Integer ngoBread) {
        this.ngoBread = ngoBread;
    }

    public Integer getAnimalFood() {
        return animalFood;
    }

    public void setAnimalFood(Integer animalFood) {
        this.animalFood = animalFood;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}
