package com.example.BackSocialNetwork.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class User {

    //Attributes
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String username;
    @NotNull
    private String name;
    @NotNull
    private String lastname;
    @NotNull
    private String email;
    @NotNull
    private String password;

    //Constructors
    public User() {
    }
    public User(Long id, String username, String name, String lastname, String email, String password) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
