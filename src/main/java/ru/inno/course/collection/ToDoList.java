package ru.inno.course.collection;

import java.util.ArrayList;

public class ToDoList {
    public static void main(String[] args){
        ArrayList<String> todoList = new ArrayList<>();
        todoList.add("Позавтракать");
        todoList.add("Помыть пол");
        todoList.add("Приготовить обед");
        todoList.add("Сделать уроки");
        todoList.add("Погулять");

        System.out.println(todoList.size());

        for(int i=0; i<todoList.size(); i++){
            System.out.println("Задача" + (i + 1) + ": " + todoList.get(i));
        }
    }
}
