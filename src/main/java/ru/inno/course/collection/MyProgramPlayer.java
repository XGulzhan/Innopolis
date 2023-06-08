package ru.inno.course.collection;

public class MyProgramPlayer {
    public static void main(String[] args){
        Player player1 = new Player(99, "Rocket", true);
        Player player2 = new Player(99, "Rocket", true);
        System.out.println(player1==player2);
        System.out.println(player1.equals(player2));

    }
}
