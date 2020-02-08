package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Poxos", "Poxosyan", 38);
        Person person2 = new Person("Petros", "Poxosyan", 58);
        Person person3 = new Person("Martiros", "Poxosyan", 77);
        Person person4 = new Person("Kikos", "Poxosyan", 77);
        Person person5 = new Person("Mike", "Poxosyan", 57);
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        Integer personMaxAge = people.stream()
                .map(Person::getAge)
                .max(Integer::compare).get();

        List<Person> collect = people.stream()
                .filter((each) -> each.getAge() == personMaxAge)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}