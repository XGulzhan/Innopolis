package ru.inno.course;

public class MyProgram1 {
  public static void main(String[] args){
        Item product = new Item("dress", 5541, 4700.99, 2, "green", 44 );
        Item product1 = new Item("table", 5542, 6850.30, 1, "pink", 0 );
        Item product2 = new Item("jacet", 5543, 3000, 1, "blue", 46 );
        Item product3 = new Item("picture", 5544, 11999.99, 1, " ", 0);
        Item product4 = new Item("milk", 5545, 78.87, 4, " ", 0);
        product.printAll();
        product1.printAll();
        product2.printAll();
        product3.printAll();
        product4.printAll();


    }
}