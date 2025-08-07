package com.multiTask.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "api/v1/client")
@RestController

public class UserController {
    @Autowired

    private final UserService user;

    public UserController(UserService client) {
        this.user = client;
    }

    @GetMapping
    public List<User> getUser() {
        return user.getUser();
    }

}
