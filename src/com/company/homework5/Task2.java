package com.company.homework5;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        String text ="Як умру, то поховайте\n" +
                "Мене на могилі\n" +
                "Серед \n" +
                " степу широкого\n" +
                "Серед степу широкого\n" +
                "На Вкраїні милій\n" +
                "Щоб лани широкополі\n" +
                "І Дніпро, і кручі\n" +
                "Було видно, було чути\n" +
                "Було видно, було чути\n" +
                "Як\n" +
                " реве\n" +
                " ревучий\n";
       List<String> a =  text.lines().distinct().filter(i -> i.length() > 8).toList();
       System.out.println(a.size());

    }
}
