package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.PostRepository;
import com.greenfoxacademy.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class PostController {

  @Autowired
  Post post;

  @Autowired
  PostRepository postRepository;

  @Autowired
  PostService postService;

  @GetMapping("/reddit")
  public String showPosts(Model model) {
    model.addAttribute("posts", postRepository.findAllByOrderByRatingDescTitleAsc());
    return "reddit";
  }


  @GetMapping("/reddit/{id}/upvote")
  public String upvote(@PathVariable(name="id") long id) {
    Post post = postRepository.findById(id).get();
    post.setRating(post.getRating() + 1);
    postRepository.save(post);
    return "redirect:/reddit";
  }

  @GetMapping("/reddit/{id}/downvote")
  public String downvote(@PathVariable(name="id") long id) {
    Post post = postRepository.findById(id).get();
    post.setRating(post.getRating() - 1);
    postRepository.save(post);
    return "redirect:/reddit";
  }

  @GetMapping("/reddit/submit")
  public String submit() {
    return "submit";
  }

  @PostMapping("/reddit/submit")
  public String listAfterSubmit(@ModelAttribute(name="title") String title, @ModelAttribute
          (name="url") String url) {
    postRepository.save(new Post(title, url));
    Post post = postRepository.findByTitle(title);
    return "redirect:/reddit";
  }



}
