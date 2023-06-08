package ru.inno.course.array;

public class array {
    public static void main(String[] args){
        String [] todoList = new String[5];
        todoList [0] = "jogging";
        todoList [1] = "planking";
        todoList [2] = "owling";
        todoList [3] = "teboewing";
        todoList [4] = "relaxing";
       for (int i=0; i < todoList.length; i++ )
        System.out.println(todoList[i]);
    }

}