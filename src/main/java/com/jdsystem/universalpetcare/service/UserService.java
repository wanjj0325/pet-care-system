package com.jdsystem.universalpetcare.service;

import com.jdsystem.universalpetcare.model.User;
import com.jdsystem.universalpetcare.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void add(User user) {
        userRepository.save(user);
    }
}