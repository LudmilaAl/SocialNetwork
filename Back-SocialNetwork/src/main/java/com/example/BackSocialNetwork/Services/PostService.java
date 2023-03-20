package com.example.BackSocialNetwork.Services;

import com.example.BackSocialNetwork.Entities.Posts;
import com.example.BackSocialNetwork.Entities.User;
import com.example.BackSocialNetwork.Interfaces.PostInterface;
import com.example.BackSocialNetwork.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements PostInterface {

    @Autowired
    PostRepository postRepository;

    @Override
    public List<Posts> getAllPosts() {
        List<Posts> posts = postRepository.findAll();
        return posts;
    }

    @Override
    public Posts findPost(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    @Override
    public List<Posts> getPostsByUser(User user) {
        List<Posts> posts = postRepository.findPostByUser(user);
        return posts;
    }

    @Override
    public void savePost(Posts posts) {
        postRepository.save(posts);
    }

    @Override
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
