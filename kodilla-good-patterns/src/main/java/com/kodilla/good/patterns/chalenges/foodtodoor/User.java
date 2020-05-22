package com.kodilla.good.patterns.chalenges.foodtodoor;

public class User {
    private  String firstName;
    private String secondName;
    private String eMail;
    private String address;
    private int postalCode;



    public User(String firstName, String secondName, String eMail, String address, int postalCode) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.eMail = eMail;
        this.address = address;
        this.postalCode = postalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAddress() {
        return address;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String geteMail() {
        return eMail;
    }
}
