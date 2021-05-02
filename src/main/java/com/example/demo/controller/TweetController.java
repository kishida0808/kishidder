package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Tweet;
import com.example.demo.repository.TweetRepository;

@Controller
public class TweetController {

  private final TweetRepository repository;

  // @Autowired ←コンストラクタが1つの場合、省略可
  public TweetController(TweetRepository repository) {
	  this.repository = repository;
  }

  @GetMapping("/")
  public String getAllTweets(@ModelAttribute Tweet tweet, Model model) {
	  model.addAttribute("tweets", repository.findAll());
	  return "list";
  }

  @PostMapping("/add")
  public String addTweet(@Validated @ModelAttribute Tweet tweet, BindingResult result, Model model) {
	  model.addAttribute("tweets", repository.findAll());
	  if (result.hasErrors()) {
		  return "list";
	  }
	  repository.save(tweet);

	 // ルートパス("/")にリダイレクト
	  return "redirect:/";
  }
}
