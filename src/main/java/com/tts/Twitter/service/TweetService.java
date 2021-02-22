package com.tts.Twitter.service;

import com.tts.Twitter.model.Tweet;
import com.tts.Twitter.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TweetService {

         List<Tweet> findAll();

     List<Tweet> findAllByUser(User user);

     List<Tweet> findAllByUsers(List<User> users);

     void save(Tweet tweet);
    }


