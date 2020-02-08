package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<List<String>> text = Stream.of(Arrays.asList("Victor ", "Farcic "), Arrays.asList("John ", "Doe ", "Third"))
                .collect(Collectors.toList());
        List<String> collect = text.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        collect.forEach(System.out::print);

    }
}
