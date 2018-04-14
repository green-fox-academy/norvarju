package com.greenfoxacademy.reddit.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Component
@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private int rating;
  private String title;
  private String link;

  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt = new Date();

  public Post(String title, String link) {
    this.id = id;
    this.rating = rating;
    this.title = title;
    this.link = link;
  }

  public Post() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getRating() {
    return rating;
  }

  public String getTitle() {
    return title;
  }

  public String getLink() {
    return link;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }
}
