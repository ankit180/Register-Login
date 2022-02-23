package com.springboot.RegistrationLogin.controller;

import com.springboot.RegistrationLogin.dto.UserRegistrationDTO;
import com.springboot.RegistrationLogin.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserService userService;

    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }

    @PostMapping()
    public String registerUserAccount(@ModelAttribute("user")UserRegistrationDTO userRegistrationDTO){
        userService.save(userRegistrationDTO);
        return "redirect:/registration?success";
    }

    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }
}
