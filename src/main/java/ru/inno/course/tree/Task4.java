package ru.inno.course.tree;
public class Task4 {
    public static void main(String[] args){
        String url = "https://vk.com/";
        boolean subString = url.contains("https://");
        if(subString){
            System.out.println("Соединение безопасно");
        }else{
            System.out.println("Небезопано. Не указывайте логины, пароли и данные банковских карт");
        }
    }

}
