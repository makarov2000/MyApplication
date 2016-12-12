package com.example.student2.myapplication;

/**
 * Created by student2 on 12.12.16.
 */

public class Crime {

    String title;
    int id;

    public Crime(String title) {
        this.title = title;
    }

    public Crime() {
    }

    public Crime(String title, int id) {

        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }
}
