package ru.inno.course;
public class Flat {
  public String address;
  public int floor;
  public int room;
  public int windows;
  public double square;
  public Flat(String address, int floor, int room, int windows, double square ){
        this.address = address;
        this.floor = floor;
        this.room = room;
        this.windows = windows;
        this.square = square;
  }
    public void printAddress() {
        System.out.println("address: "+address);
    }
    public void printAll() {
        System.out.println("address: "+address);
        System.out.println("floor: "+floor);
        System.out.println("room: "+room);
        System.out.println("windows: "+windows);
        System.out.println("square: "+square);
    }
}
