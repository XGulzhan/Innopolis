package ru.inno.course;
public class lesson4{
    public static void main(String[] args){
    String card = "54864700 1123 4358";
    //String card0 = card.substring(0,card.length()-4);
    //System.out.println(card.length());
    //System.out.print(card0.replaceAll("\\d", "*"));
    System.out.println("**** **** **** "+card.substring(card.length()-4,card.length()));
    }
}

