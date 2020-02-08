package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Person sara = new Person("Sara ", 4);
        Person victor = new Person("Victor ", 40);
        Person eva = new Person("Eva ", 42);

        List<Person> people = new ArrayList<>();
        people.add(sara);
        people.add(victor);
        people.add(eva);

        List<Person> kids = people.stream()
                .filter((each) -> each.getAge() < 18)
                .collect(Collectors.toList());

        List<Person> adult = people.stream()
                .filter((each) -> each.getAge() >= 18)
                .collect(Collectors.toList());

        Map<Boolean, List<Person>> booleanListMap = new HashMap<>();
        booleanListMap.put(true, adult);
        booleanListMap.put(false, kids);
        booleanListMap.values().forEach(System.out::println);

    }
}