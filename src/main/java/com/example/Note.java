package com.example;

/**
 * Created by Ben on 2/10/17.
 */
public class Note {
    private int id;
    private String title;
    private User user;

    public Note() {
    }

    public Note(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Note(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
