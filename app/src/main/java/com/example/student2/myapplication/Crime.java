package com.example.student2.myapplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import static android.R.attr.data;

/**
 * Created by student2 on 12.12.16.
 */

public class Crime {

    public void setIsSolved(boolean solved){
        isSolved = solved;
    }

    String title;
    UUID id;
    boolean isSolved;
    Date date;
    
    public Crime(String title) {
        this.title = title;
    }

    public Crime() {
    }

    public Crime(String title, UUID id) {

        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public UUID getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Crime{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", isSolved=" + isSolved +
                ", date=" + date +
                '}';
    }
}

