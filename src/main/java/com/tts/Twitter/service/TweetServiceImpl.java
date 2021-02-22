package com.tts.Twitter.service;

import com.tts.Twitter.model.Tweet;
import com.tts.Twitter.model.User;
import com.tts.Twitter.repository.TweetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetServiceImpl implements TweetService {

    private TweetRepository tweetRepository;

    public TweetServiceImpl(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    @Override
    public List<Tweet> findAll() {
        List<Tweet> tweets = tweetRepository.findAllByOrderByCreatedAtDesc();
        return tweets;
    }

    @Override
    public List<Tweet> findAllByUser(User user) {
        List<Tweet> tweets = tweetRepository.findAllByUserOrderByCreatedAtDesc(user);
        return tweets;
    }

    @Override
    public List<Tweet> findAllByUsers(List<User> users) {
        List<Tweet> tweets = tweetRepository.findAllByUserInOrderByCreatedAtDesc(users);
        return tweets;
    }

    @Override
    public void save(Tweet tweet) {
        tweetRepository.save(tweet);
    }
}