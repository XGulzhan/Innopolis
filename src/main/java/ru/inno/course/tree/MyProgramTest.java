package ru.inno.course.tree;

import ru.inno.course.oop.Car;

public class MyProgramTest {
    public static void main(String[] args) {
        Car1 honda =  new Car1("green", "Honda", "fit", 100, "u100ho");
        honda.beep();
        honda.getHp();
        int i = honda.getHp();
        System.out.println("i = " +i);

        honda.boost(-200);
        i = honda.getHp();
        System.out.println("i = " +i);
        honda.getColor();
    }
}
