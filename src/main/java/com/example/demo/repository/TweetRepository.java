package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long>{
}
