package com.springboot.RegistrationLogin.service;

import com.springboot.RegistrationLogin.dto.UserRegistrationDTO;
import com.springboot.RegistrationLogin.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDTO userRegistrationDTO);

}
