package com.example.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.repository.TweetRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class DataLoader implements CommandLineRunner {
  private final TweetRepository repository;

  @Override
  public void run(String... args) throws Exception{
	  /*
	  // テスト用
	  Tweet tweet = new Tweet();
	  tweet.setContent("こんにちは");
	  repository.save(tweet);

	  tweet = new Tweet();
	  tweet.setContent("テストコメント");
	  repository.save(tweet);

	  */

  }
}
