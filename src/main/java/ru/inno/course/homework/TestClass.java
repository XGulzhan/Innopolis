package ru.inno.course.homework;

import java.io.IOException;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        PlayerService service = new PlayServiceJason();



        if (command.toLowerCase().startsWith("add")){
            String nick = command.substring(4);
          int newPlayerId = service.createPlayer(nick);
            System.out.println(newPlayerId);
        }
        if (command.toLowerCase().startsWith("get")){
            String idAsString = command.substring(4);
            int id = Integer.parseInt(idAsString);
            Player player = service.getPlayerById(id);
            System.out.println(player);

    }
        if (command.toLowerCase().startsWith("delete")){
            String idAsString = command.substring(7);
            int id = Integer.parseInt(idAsString);
            Player player = service.deletePlayer(id);
            System.out.println(player);

        if (command.toLowerCase().startsWith("points")){
                String argsString = command.substring(7);
                String [] arguments = argsString.split(" ");
                id = Integer.parseInt(arguments[0]);
                int points = Integer.parseInt(arguments [1]);
                int newScore = service.addPoints(id, points);

                System.out.println(newScore);
   }

  }
 }
}
