package com.ll;

public class textBook {
    private long id;
    private String text;
    private String authorName;

    public textBook(long id, String text, String authorName) {
        this.id = id;
        this.text = text;
        this.authorName = authorName;
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getAuthorName() {
        return authorName;
    }

}
