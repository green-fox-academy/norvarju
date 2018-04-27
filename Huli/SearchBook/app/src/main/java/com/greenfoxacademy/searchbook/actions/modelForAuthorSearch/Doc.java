package com.greenfoxacademy.searchbook.actions.modelForAuthorSearch;

public class Doc {

    String title_suggest;

    public Doc(String title_suggest) {
        this.title_suggest = title_suggest;
    }

    public Doc() {
    }

    public String getTitle_suggest() {
        return title_suggest;
    }

    public void setTitle_suggest(String title_suggest) {
        this.title_suggest = title_suggest;
    }
}
