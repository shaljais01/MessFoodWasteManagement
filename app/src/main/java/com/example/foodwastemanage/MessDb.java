package com.example.foodwastemanage;

import java.sql.Timestamp;

public class MessDb {
    private String userName;
    private Integer ngoGravy;
    private Integer ngoBread;
    private Integer animalFood;
    private String time;

    public MessDb(String userName, Integer ngoGravy, Integer ngoBread, Integer animalFood, String time) {
        this.userName = userName;
        this.ngoGravy = ngoGravy;
        this.ngoBread = ngoBread;
        this.animalFood = animalFood;
        this.time = time;
    }

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
