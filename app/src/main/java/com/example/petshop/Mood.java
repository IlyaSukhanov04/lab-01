package com.example.petshop;
import java.util.Date;

public abstract class Mood {

    public abstract String getMood();

    private Date date;

    public Mood() {
        this.date = new Date();
    }

    public Date dateNow() {
        return date;
    }

    public void dateSet(Date date) {
        this.date = date;
    }

}
