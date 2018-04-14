package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

  Post findByTitle(String title);
  List<Post> findAllByOrderByRatingDescTitleAsc();
}
