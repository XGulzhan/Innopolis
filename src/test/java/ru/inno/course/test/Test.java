package ru.inno.course.test;

import ru.inno.course.homework.PlayServiceJason;
import ru.inno.course.homework.PlayerService;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test {
    public static void main(String[] args) {
        PlayerService service = new PlayServiceJason();
        //вызвать сервис на создание.
        //передать валидные данные
        service.createPlayer("Rocket");

        //проверить что в списке один игрок
        int currentSize = service.getPlayers().size();
        System.out.println(currentSize == 1);

        //проверить существует ли файл дата.джейсон
        boolean fileExists = Files.exists(Path.of("data.json"));
        System.out.println(fileExists);
    }
}
