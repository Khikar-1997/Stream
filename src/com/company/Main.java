package com.company;

import java.util.ArrayList;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        String sum = numbers.stream()
                .reduce((Integer::sum))
                .toString();
        System.out.println(sum);
    }
}