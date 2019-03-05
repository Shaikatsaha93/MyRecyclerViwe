package com.example.diu.myrecyclerviwe;

public class Listitem {

    private String name;
    private String email;
    private String address;
    private String gender;

    public Listitem(String name, String email, String address, String gender) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }
}
