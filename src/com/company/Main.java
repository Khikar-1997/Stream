package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Person sara = new Person("Sara ", 4);
        Person victor = new Person("Victor ", 40);
        Person eva = new Person("Eva ", 42);
        Person anna = new Person("Anna ", 5);
        Person mike = new Person("Mike ", 57);
        List<Person> people = new ArrayList<>();
        people.add(sara);
        people.add(victor);
        people.add(eva);
        people.add(anna);
        people.add(mike);
        List<String> collect = people.stream()
                .filter((each) -> each.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.print("Name of kids - ");
        collect.forEach(System.out::print);
        System.out.print(".");
    }
}