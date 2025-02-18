package com.bee.showcase.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoggedUserDetailsController {

    @GetMapping("/logged/user")
    public String testUserLoginReturnsUserName() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

    @GetMapping
    public String testUserLoginWithSuccessMessage() {
        return "Logged in successfully";
    }
}
