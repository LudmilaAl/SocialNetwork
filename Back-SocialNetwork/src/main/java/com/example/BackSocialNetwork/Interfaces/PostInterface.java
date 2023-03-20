package com.example.BackSocialNetwork.Interfaces;

import com.example.BackSocialNetwork.Entities.Posts;

import java.util.List;

public interface PostInterface {

    public List<Posts> getAllPosts();

    public Posts findPost(Long id);

    public List<Posts> getPostsByUserId(Long userId);

    public void savePost(Posts posts);

    public void deletePost(Long id);


}
