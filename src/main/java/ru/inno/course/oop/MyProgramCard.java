package ru.inno.course.oop;

public class MyProgramCard {
    public static void main(String[] args) {
        Card newCard = new Card("5486 4700 1123 3456", "06/24", "977", "4595");
        newCard.maskNumber();
        newCard.pinCode("4595");

    }
}
