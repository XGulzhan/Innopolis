package ru.inno.course;

public class Item {
    public String name;
    public int article;
    public double price;
    public int amount;
    public String color;
    public int size;
    public Item (String name, int article, double price, int amount, String color, int size){
        this.name = name;
        this.article = article;
        this.price = price;
        this.amount = amount;
        this.color = color;
        this.size = size;

    }
    public void printAll() {
        System.out.print("name: "+name+ ", ");
        System.out.print("article: "+article+ ", ");
        System.out.print("price: "+price+ ", ");
        System.out.print("amount: "+amount+ ", ");
        System.out.print("color: "+color+ ", ");
        System.out.println("size: "+size+ ";");
    }

}
