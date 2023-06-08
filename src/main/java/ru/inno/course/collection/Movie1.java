package ru.inno.course.collection;

public class Movie1 {
    String name;
    double rating;
    String genre;
    String country;
    boolean Oscar;

    @Override
    public String toString() {
        return "Movie1{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", Oscar=" + Oscar +
                '}';
    }

    public Movie1(String name, double rating, String genre, String country, boolean oscar) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        Oscar = oscar;

    }
}





