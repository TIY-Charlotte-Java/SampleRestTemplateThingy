package com.example;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * Created by Ben on 2/10/17.
 */
public class User {
    private int id;
    private String name;

    @JsonBackReference
    private Note note;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
