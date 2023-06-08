package ru.inno.course.collection;

import java.util.ArrayList;

public class Company {
    private String name;
    private String foundationDate;
    private ArrayList<String> listFilms;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(String foundationDate) {
        this.foundationDate = foundationDate;
    }

    public ArrayList<String> getListFilms() {
        return listFilms;
    }

    public void setListFilms(ArrayList<String> listFilms) {
        this.listFilms = listFilms;
    }

    public Company(String name, String foundationDate, ArrayList<String> listFilms) {
        this.name = name;
        this.foundationDate = foundationDate;
        this.listFilms = listFilms;


    }
}