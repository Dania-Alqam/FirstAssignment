package com.example.firstassignment.model;

import java.util.List;

public class Info {
    private String name ;
    private String email;
    private  String pass;
    private String gender;

    public Info(String name, String email, String pass, String gender) {
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

