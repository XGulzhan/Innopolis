package ru.inno.course.loop;

public class Players {
    public static void main(String[] args){
        String [] player = new String [10];
        player[0] = "Александр Овечкин";
        player[1] = "Евгений Малкин";
        player[2] = "Павел Дацюк";
        player[3] = "Павел Буре";
        player[4] = "Сергей Федоров";
        player[5] = "Илья Ковальчук";
        player[6] = "Александр Радулов";
        player[7] = "Вячеслав Фетисов";
        player[8] = "Александр Могильный";
        player[9] = "Владислав Третьяк";

        for (int i=0; i<3; i++){
            System.out.println(player[i]);
        }


    }
}
