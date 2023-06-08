package ru.inno.course.classwork;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        String asString = "2023-06-07";
        LocalDate date = LocalDate.now();
        LocalDate yesterday = LocalDate.of(2023,06, 06);
        LocalDate tomorrow = LocalDate.parse("2023-06-08");


        System.out.println(date);
        System.out.println(date.plusDays(3));
        System.out.println(date.minusMonths(6));
        System.out.println(yesterday);
        System.out.println(tomorrow);
        System.out.println(date.isAfter(tomorrow));

        LocalTime time = LocalTime.now();
        System.out.println(time.minusHours(2));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(formatter.format(dateTime));
    }
}
