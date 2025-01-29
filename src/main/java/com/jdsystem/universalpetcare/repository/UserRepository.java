package com.jdsystem.universalpetcare.repository;


import com.jdsystem.universalpetcare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
