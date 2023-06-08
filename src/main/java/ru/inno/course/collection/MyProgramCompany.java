package ru.inno.course.collection;

import java.util.ArrayList;
import java.util.List;

public class MyProgramCompany {
    public static void main(String[] args){
        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<String> portfolio1 = new ArrayList<>();
        portfolio1.add("Криминальное чтиво");
        portfolio1.add("Эмма");
        portfolio1.add("Джентельмены");

        ArrayList<String> portfolio2 = new ArrayList<>();
        portfolio2.add("Вверх");
        portfolio2.add("Душа");
        portfolio2.add("История игрушек");

        ArrayList<String> portfolio3 = new ArrayList<>();
        portfolio3.add("Кин-дза-дза");
        portfolio3.add("Девчата");
        portfolio3.add("Мимино");

        Company company1 = new Company("Мирамакс", "1979", portfolio1);
        Company company2 = new Company("Пиксар", "1979", portfolio2);
        Company company3 = new Company("Мосфильм", "1924", portfolio3);

        companies.add(company1);
        companies.add(company2);
        companies.add(company3);



        for (int i=0; i<companies.size(); i++){
            System.out.println(companies.get(i).getName() +": " +companies.get(i).getFoundationDate() +": " +companies.get(i).getListFilms());
        }
    }
}
