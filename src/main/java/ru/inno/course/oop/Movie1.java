package ru.inno.course.oop;

public class Movie1 {
    private String title;
    private double rating;
    private int counter;

    public Movie1(String title){
        this.title = title;
        rating = 0;
        counter = 0;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    public int getCounter() {
        return counter;
    }
    public void rate(double rating){
        double newVal = this.rating + rating;
        int newCounter = this.counter+=1;
        this.rating = newVal / newCounter;
    }
}

