package com.springboot.RegistrationLogin.service;

import com.springboot.RegistrationLogin.dto.UserRegistrationDTO;
import com.springboot.RegistrationLogin.model.User;

public interface UserService {

    User save(UserRegistrationDTO userRegistrationDTO);

}
