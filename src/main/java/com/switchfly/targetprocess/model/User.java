package com.switchfly.targetprocess.model;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("Id")
    private int id;
    @SerializedName("FirstName")
    private String firstName;
    @SerializedName("LastName")
    private String lastName;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}