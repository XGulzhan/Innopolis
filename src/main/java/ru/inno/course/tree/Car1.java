package ru.inno.course.tree;
public class Car1 {

    String color;
    String brand;
    String model;
    int Hp;
    String plateNumber;
    public Car1(String color, String brand, String model, int Hp, String plateNumber){
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.Hp = Hp;
        this.plateNumber = plateNumber;
    }

        public void beep(){
            System.out.println("Beeeep!");
        }
        public int getHp(){
        return this.Hp;
        }
        public void boost(int x){
        this.Hp += x;
        }
        public void setHp(int hp){
        this.Hp =  Hp;
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
