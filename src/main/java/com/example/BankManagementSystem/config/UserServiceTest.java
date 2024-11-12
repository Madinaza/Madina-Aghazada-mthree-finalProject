package com.example.BankManagementSystem.config;

import com.example.BankManagementSystem.model.User;
import com.example.BankManagementSystem.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceTest {

    private final UserRepository userRepository;

    public UserServiceTest(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
