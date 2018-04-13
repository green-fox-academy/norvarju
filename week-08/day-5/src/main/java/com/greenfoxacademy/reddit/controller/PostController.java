package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.PostRepository;
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

  @GetMapping("/reddit")
  public String showPosts(Model model) {
    model.addAttribute("posts", postRepository.findAll());
    return "reddit";
  }


  @GetMapping("/reddit/{id}/upvote")
  public String upvote(@PathVariable(name="id") long id, Model model) {
    Post post = postRepository.findById(id).get();
    post.setRating(post.getRating() + 1);
    postRepository.save(post);
    return "redirect:/reddit";
  }

  @GetMapping("/reddit/{id}/downvote")
  public String downvote(@PathVariable(name="id") long id, Model model) {
    Post post = postRepository.findById(id).get();
    post.setRating(post.getRating() - 1);
    postRepository.save(post);
    return "redirect:/reddit";
  }


}
