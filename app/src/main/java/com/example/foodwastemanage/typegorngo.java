package com.example.foodwastemanage;


public class typegorngo {

    String messName;
    String location;
    String quannRoti;
    String quanGravy;
    int rating;
    String photo;

    public typegorngo(String messName, String location, String quannRoti, String quanGravy,String photo,int rating)
    {
        this.messName=messName;
        this.location=location;
        this.quannRoti=quannRoti;
        this.quanGravy=quanGravy;
        this.photo=photo;
        this.rating=rating;
    }

    public String getPhoto() {
        return photo;
    }

    public String getMessName() {
        return messName;
    }

    public String getLocation() {
        return location;
    }

    public String getQuannRoti() {
        return quannRoti;
    }

    public String getQuanGravy() {
        return quanGravy;
    }

    public int getRating() {
        return rating;
    }
}
