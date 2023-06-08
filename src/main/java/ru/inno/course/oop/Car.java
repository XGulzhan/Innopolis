package ru.inno.course.oop;

public class Car {
    public int currentSpeed = 0;

    public Car(int currentSpeed){
        this.currentSpeed = currentSpeed;
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    public int speedUp(int increment){
        currentSpeed+=increment;
        return currentSpeed;
    }
    public int brake(){
        currentSpeed=currentSpeed-10;
        return currentSpeed;
    }
}
