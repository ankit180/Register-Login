package com.springboot.RegistrationLogin.repository;

import com.springboot.RegistrationLogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
