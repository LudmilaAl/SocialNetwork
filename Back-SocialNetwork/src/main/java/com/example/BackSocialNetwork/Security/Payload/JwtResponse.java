package com.example.BackSocialNetwork.Security.Payload;

public class JwtResponse {
    //Attributes
    private String token;

    //Constructor
    public JwtResponse() {
    }

    public JwtResponse(String token) {
        this.token = token;
    }
    //Getters and Setters

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
