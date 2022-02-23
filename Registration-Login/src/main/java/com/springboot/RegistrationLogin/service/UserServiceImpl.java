package com.springboot.RegistrationLogin.service;

import com.springboot.RegistrationLogin.dto.UserRegistrationDTO;
import com.springboot.RegistrationLogin.model.Role;
import com.springboot.RegistrationLogin.model.User;
import com.springboot.RegistrationLogin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDTO userRegistrationDTO) {
        User user = new User(userRegistrationDTO.getFirstName(),
                userRegistrationDTO.getLastName(),
                userRegistrationDTO.getEmail(),
                userRegistrationDTO.getPassword(),
                Collections.singletonList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }
}
