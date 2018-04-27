package com.greenfoxacademy.searchbook.actions.modelForAuthorSearch;

import java.util.List;

public class Doc {

    String title_suggest;
    List<String> author_name;
    List<String> publisher;
    List<String> publish_date;

    public Doc(String title_suggest, List<String> author_name, List<String> publisher, List<String> publish_date) {
        this.title_suggest = title_suggest;
        this.author_name = author_name;
        this.publisher = publisher;
        this.publish_date = publish_date;
    }

    public Doc() {
    }

    public String getTitle_suggest() {
        return title_suggest;
    }

    public void setTitle_suggest(String title_suggest) {
        this.title_suggest = title_suggest;
    }

    public List<String> getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(List<String> author_name) {
        this.author_name = author_name;
    }

    public List<String> getPublisher() {
        return publisher;
    }

    public void setPublisher(List<String> publisher) {
        this.publisher = publisher;
    }

    public List<String> getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(List<String> publish_date) {
        this.publish_date = publish_date;
    }
}
