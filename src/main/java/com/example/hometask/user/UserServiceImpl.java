package com.example.hometask.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> findAll() {
        List<User> usersList = new ArrayList<>();
        usersList.add(new User(1L, "Jason Forhess"));
        usersList.add(new User(2L, "Freddie Crueger"));
        usersList.add(new User(3L, "Hannibal Lecter"));
        usersList.add(new User(4L, "Jack Sparrow"));
        return usersList;
    }
}
