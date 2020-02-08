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

        List<Person> norvegian = people.stream()
                .filter((each) -> each.getNationality().equals(Nationality.NORWEGIAN))
                .collect(Collectors.toList());

        List<Person> serbian = people.stream()
                .filter((each) -> each.getNationality().equals(Nationality.SERBIAN))
                .collect(Collectors.toList());

        Map<String, List<Person>> personsListByNationality = new HashMap<>();
        personsListByNationality.put(Nationality.NORWEGIAN.toString(), norvegian);
        personsListByNationality.put(Nationality.SERBIAN.toString(), serbian);
        personsListByNationality.values().forEach(System.out::println);
    }
}