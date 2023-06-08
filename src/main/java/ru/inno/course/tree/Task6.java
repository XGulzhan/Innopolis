package ru.inno.course.tree;

public class Task6 {
    public static void main(String[] args) {
        String password;
        password = "Qwerty0987654321";
        if (password.equals("Qwerty0987654321")) {
            System.out.println("Доступ разрешен");
        }else{
            System.out.println("Доступ запрещен");
        }
    }
}