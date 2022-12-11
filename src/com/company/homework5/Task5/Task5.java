package com.company.homework5.Task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        Person person1 = new Person("Vlad","Kharchenko",50);
        Person person2 = new Person("Joraro","Kujo",45);
        Person person3 = new Person("Chel","Chelich",20);
        Person person4 = new Person("Jaroslava","Drazymenko",20);
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        String result = personList.stream()
                .filter(i -> (i.getFirstName() + " " + i.getLastName()).length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .get().getFullName();
        if(!result.isEmpty()) System.out.println(result);
        else System.out.println("this list is empty");
    }
}
