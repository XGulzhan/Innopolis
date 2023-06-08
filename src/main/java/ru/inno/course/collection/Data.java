package ru.inno.course.collection;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Data {
    public static void main (String[] args){
        LocalDate date = LocalDate.now();
        LocalDate yesterday = LocalDate.of(2023, 05, 29);

        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime dateTime1 = LocalDateTime.of(LocalDate.now(), LocalTime.now());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println(dateTime1);
        System.out.println(date);
        System.out.println(yesterday);
        System.out.println(formatter.format(dateTime));
    }
}
