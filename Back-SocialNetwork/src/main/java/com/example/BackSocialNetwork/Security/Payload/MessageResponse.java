package com.example.BackSocialNetwork.Security.Payload;

public class MessageResponse {

    //Attributes
    private String message;

    //Constructor
    public MessageResponse() {
    }

    public MessageResponse(String message) {
        this.message = message;
    }
    //Getters and Setters

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
