package com.example;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

/**
 * Created by Ben on 2/10/17.
 */

public class NoteDataModel {
    private int id;
    private String title;
    private User user;

    @JsonIgnore
    private List<Integer> randomlist;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Integer> getRandomlist() {
        return randomlist;
    }

    public void setRandomlist(List<Integer> randomlist) {
        this.randomlist = randomlist;
    }
}
