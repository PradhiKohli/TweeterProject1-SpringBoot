package com.tts.Twitter.service;

import com.tts.Twitter.model.User;
//import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface UserService {
// encodes
    User findByUsername(String username);
    List<User> findAll();
    void save(User user);
    User saveNewUser(User user);
   // User getloggedInUser();

    User getLoggedInUser();
}
