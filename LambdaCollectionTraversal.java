package com.sap;

import java.util.*;

public class LambdaCollectionTraversal {
    public static void main(String[] args) {
        //traverseArrayList();
        //traverseSet();
        traverseMap();
    }

    public static void traverseArrayList() {
        List<String> al = new ArrayList<>();
        al.add("fred");
        al.add("barney");

        // Prints in same lines
        //((ArrayList) al).forEach(x -> System.out.print(x +","));
        al.forEach(x -> System.out.print(x +","));

        // Prints in different lines
        al.forEach(System.out::println);
    }

    public static void traverseSet() {
        Set<String> al = new HashSet<>();
        al.add("fred");
        al.add("barney");
        al.add("fred");

        // Prints in same lines
        al.forEach(x -> System.out.print(x +","));

        // Prints in different lines
        al.forEach(System.out::println);
    }

    public static void traverseMap() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"fred");
        map.put(2,"barney");
        map.put(1,"fred");

        // Prints in same lines
        map.forEach( (k,v) -> System.out.print("Key: "+ k + " Value: "+v) );

    }
}


