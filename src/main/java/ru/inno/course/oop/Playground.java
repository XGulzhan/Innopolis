package ru.inno.course.oop;

public class Playground {
    public static void main(String[] args){
        Book bookFromDb = new Book("12 стульев", "Ильф и Петров", "124-35214-43523", "Роман", 199);
        Book bookFromXML = new Book("12 стульев", "Ильф и Петров", "124-35214-43523", "Роман", 199);
 //       System.out.println(bookFromDb == bookFromXML);
 //       System.out.println(bookFromDb.getTitle().equals(bookFromXML.getTitle()));
 //       System.out.println(bookFromDb.getAuthor().equals(bookFromXML.getAuthor()));
 //       System.out.println(bookFromDb.getISBN().equals(bookFromXML.getISBN()));
 //       System.out.println(bookFromDb.getGenre().equals(bookFromXML.getGenre()));
//        System.out.println(bookFromDb.getPrice() == (bookFromXML.getPrice()));
//        System.out.println(bookFromDb.equals(bookFromXML));

        System.out.println(bookFromDb.equals(bookFromXML));
        System.out.println(bookFromDb.hashCode());
        System.out.println(bookFromXML.hashCode());
        System.out.println(bookFromDb);
    }
}
