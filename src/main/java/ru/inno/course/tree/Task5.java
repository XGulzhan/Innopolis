package ru.inno.course.tree;

public class Task5 {
    public static void main(String[] args){
        String password;
        password = "Omsk";
        int x=0;  //чтобы проверить на соотвествие параметрам,добавляем счетчик
        if (password.length() >= 8){
            x= x+1;
        } else{
                System.out.println("Пароль не менее 8 символов");
            }
        if (password.matches(".*\\d+.*")) {
            x=x+1;
        }else{
            System.out.println("Пароль должен содержать минимум 1 цифру");
        }
        if(password.matches(".*[!@#\\$%\\^&\\*\\(\\)_\\+].*")){
            x=x+1;
        } else{
                System.out.println("Пароль должен содержать минимум 1 спецсимвол");
            }
        if (x == 3){ // проверка счетчика, если равно 3, то принят
            System.out.println("Пароль принят");
        }
    }
        }

