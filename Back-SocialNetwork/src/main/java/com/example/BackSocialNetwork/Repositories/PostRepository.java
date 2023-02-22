package com.example.BackSocialNetwork.Repositories;

import com.example.BackSocialNetwork.Entities.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public interface PostRepository extends JpaRepository<Posts, Long> {
    Optional<Posts> findPostById(Long id);

}
