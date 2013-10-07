package org.spilth.testweb.models;

public class Post {
    private String title = "TITLE";
    private String body = "BODY";

    public int getId() {
        return 1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
