package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<>();
        text.add("My");
        text.add(" name");
        text.add(" is");
        text.add(" John");
        text.add(" Doe");
        List<String> collect = text.stream()
                .filter((each) -> each.length() - 1 <= 3)
                .collect(Collectors.toList());
        collect.forEach(System.out::print);
    }
}
