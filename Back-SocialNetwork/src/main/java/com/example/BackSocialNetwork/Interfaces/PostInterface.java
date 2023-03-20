package com.example.BackSocialNetwork.Interfaces;

import com.example.BackSocialNetwork.Entities.Posts;
import com.example.BackSocialNetwork.Entities.User;

import java.util.List;

public interface PostInterface {

    public List<Posts> getAllPosts();

    public Posts findPost(Long id);

    public List<Posts> getPostsByUser(User user);

    public void savePost(Posts posts);

    public void deletePost(Long id);


}
