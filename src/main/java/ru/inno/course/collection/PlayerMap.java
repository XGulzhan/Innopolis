package ru.inno.course.collection;

import java.awt.*;
import java.util.*;
import java.util.List;

public class PlayerMap {
    public static void main(String[] args){
        Player player1 = new Player(1, "Rocket", true);
        Player player2 = new Player(2, "Rog", false);
        Player player3 = new Player(3, "Ovi", true);
        Player player4 = new Player(4, "Geno", true);
        Player player5 = new Player(5, "MacD", true);
        Player player6 = new Player(6, "Kegger", true);
        Player player7 = new Player(7, "Tanger", true);
        Player player8 = new Player(8, "Bobs", true);
        Player player9 = new Player(9, "Barks", false);
        Player player10 = new Player(10, "Bread", false);

        Map<Player, Integer> points = new HashMap<>();

        points.put(player1, 0);
        points.put(player2, 0);
        points.put(player3, 0);
        points.put(player4, 0);
        points.put(player5, 0);
        points.put(player6, 0);
        points.put(player7, 0);
        points.put(player8, 0);
        points.put(player9, 0);
        points.put(player10, 0);

        points.put(player4, 10);
        points.put(player7, 12);
        points.put(player8, 11);
        points.put(player9, 13);
        points.put(player10, 5);

        List<Map.Entry<Player, Integer>> list = new ArrayList<>(points.entrySet());
        System.out.println(list);
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        int i = 0;
        for (Map.Entry<Player,Integer> entry : list){
            if (i==3){
                break;
            }
            System.out.println(("Player " +entry.getKey().getId()) + ": " + entry.getValue() + " points");
            i++;
        }

    }
}
