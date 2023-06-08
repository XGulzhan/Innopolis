package ru.inno.course.oop;

public class MyProgramCar {
    public static void main(String[] args) {
        Car Solaris = new Car(25);
        System.out.println(Solaris.getCurrentSpeed());
        System.out.println(Solaris.speedUp(15));

    }
}
