package com.example.hometask.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller

public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public String getAllUsers(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "index";
    }
}
