package ru.inno.course.collection;

import ru.inno.course.array.Movie;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FavouriteMovie1 {
    public static void main(String[] args){
        List<Movie1> films = new ArrayList<>();
        films.add(new Movie1("Английский пациент", 7.9, "Drama", "USA", true));
        films.add(new Movie1("Довод", 7.5, "Fantastic", "Great Britain", false));
        films.add(new Movie1("Интерстеллар", 8.6, "Science fiction", "USA", true));

        for (int i=0; i<films.size(); i++) {
            //System.out.println(films.get(i).toString());
            System.out.println(films.get(i).name + ", "+ films.get(i).rating + ", "+ films.get(i).genre + ", "+ films.get(i).country + ", " +films.get(i).Oscar);
        }

    }
}

