package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Person sara = new Person("Sara ", 4, Nationality.NORWEGIAN);
        Person victor = new Person("Victor ", 40, Nationality.SERBIAN);
        Person eva = new Person("Eva ", 42, Nationality.NORWEGIAN);

        List<Person> people = new ArrayList<>();
        people.add(sara);
        people.add(victor);
        people.add(eva);

        String collect = people.stream()
                .map(Person::getName)
                .collect(Collectors.joining(","));
        
        System.out.println("Names: " + collect);
    }
}