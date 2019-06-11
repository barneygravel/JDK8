package com.sap.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortPerson {
    public static void main(String[] args) {
        Person p1 = new Person(1,"Abhinav",40);
        Person p2 = new Person(2,"Barney",35);
        Person p3 = new Person(3,"Fred",30);

        List<Person> l = new ArrayList<>();
        l.add(p3);
        l.add(p2);
        l.add(p1);



        printPersons(l);
        //Collections.sort(l);
        //printPersons(l);

        Comparator<Person> compareByName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        //Comparator<Person> compareByNameLambda = (x,y) -> (x.getName().compareTo(y.getName()));
        Comparator<Person> compareByNameLambda = Comparator.comparing (Person::getName).thenComparing(Person::getAge);
        Comparator<Person> compareByNameLambdaReversed = compareByNameLambda.reversed();

        Collections.sort(l,compareByNameLambda);
        printPersons(l);

        Collections.sort(l,compareByNameLambdaReversed);
        printPersons(l);
    }


    private static void printPersons(List<Person> a) {
        System.out.println(a);
    }
}
