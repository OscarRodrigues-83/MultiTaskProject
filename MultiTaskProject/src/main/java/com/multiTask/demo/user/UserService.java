package com.multiTask.demo.user;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public List<User> getUser() {
        return List.of(new User(1L, "Oscar", "ukbosca@gmail.com",LocalDate.of(2005, 05, 03)));

    }
}
