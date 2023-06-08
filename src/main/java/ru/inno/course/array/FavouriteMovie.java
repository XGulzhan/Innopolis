package ru.inno.course.array;


 public class FavouriteMovie {
     public static void main(String[] args){
         Movie [] films = new Movie[5];
         films[0] = new Movie("Английский пациент", 7.9, "Drama", "USA", true);
         films[1] = new Movie("Довод", 7.5, "Fantastic", "Great Britain", false);
         films[2] = new Movie("Интерстеллар", 8.6, "Science fiction", "USA", true);
         System.out.println(films[0].name+ ", "+ films[0].rating+ ", "+ films[0].genre+ ", "+ films[0].country+ ", "+films[0].Oscar);
         System.out.println(films[1].name+ ", "+ films[1].rating+ ", "+ films[1].genre+ ", "+ films[1].country+ ", "+films[1].Oscar);
         System.out.println(films[2].name+ ", "+ films[2].rating+ ", "+ films[2].genre+ ", "+ films[2].country+ ", "+films[2].Oscar);
        }
    }
