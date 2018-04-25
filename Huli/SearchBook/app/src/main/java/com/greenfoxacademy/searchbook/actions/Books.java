package com.greenfoxacademy.searchbook.actions;

public class Books {

    private String id;
    private String icon_url;
    private String url;
    private String value;

    public Books(String id, String icon_url, String url, String value) {
        this.id = id;
        this.icon_url = icon_url;
        this.url = url;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
