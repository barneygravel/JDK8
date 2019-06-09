package com.sap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        List<Integer> al1 = new ArrayList<>(Arrays.asList(3,1,6,5));
        List<Integer> al2 = new ArrayList<>(Arrays.asList(3,1,2,5));

        al1.stream().filter(x -> x>4).forEach(System.out::println);
        al2.stream().filter(x -> x>4).forEach(System.out::println);

        List a1 = al1.stream().filter(x -> x>4).collect(Collectors.toList());
        int a2 = al2.stream().filter(x -> x>4).findFirst().get();
    }
}
