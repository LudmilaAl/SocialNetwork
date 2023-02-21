package com.example.BackSocialNetwork.Interfaces;

import com.example.BackSocialNetwork.Entities.User;

import java.util.List;

public interface UserInterface {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public void deleteUser(Long id);

    public User findUser(Long id);


}
