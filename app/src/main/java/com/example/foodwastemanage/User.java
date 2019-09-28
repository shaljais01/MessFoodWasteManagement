package com.example.foodwastemanage;


public class User
{
    String username;
    String password;
    String usertype;
    String photo;
    String addressPin;
    String addressLocality;
    String addressState;
    String addressCity;
    String longitude;
    String latitude;
    String phone;

    public User() {
    }

    public User(String username, String password, String usertype, String photo, String addressPin, String addressLocality, String addressState,
                String addressCity, String longitude, String latitude, String phone)
    {
        this.username=username;
        this.password=password;
        this.usertype=usertype;
        this.photo=photo;
        this.addressPin=addressPin;
        this.addressLocality=addressLocality;
        this.addressState=addressState;
        this.addressCity=addressCity;
        this.longitude=longitude;
        this.latitude=latitude;
        this.phone=phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getAddressPin() {
        return addressPin;
    }

    public void setAddressPin(String addressPin) {
        this.addressPin = addressPin;
    }

    public String getAddressLocality() {
        return addressLocality;
    }

    public void setAddressLocality(String addressLocality) {
        this.addressLocality = addressLocality;
    }

    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}