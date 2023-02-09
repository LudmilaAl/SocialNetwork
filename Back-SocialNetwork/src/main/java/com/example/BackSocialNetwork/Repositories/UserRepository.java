package com.example.BackSocialNetwork.Repositories;

import com.example.BackSocialNetwork.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
