package com.example.BackSocialNetwork.Services;

import com.example.BackSocialNetwork.Entities.User;
import com.example.BackSocialNetwork.Interfaces.UserInterface;
import com.example.BackSocialNetwork.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserInterface {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
