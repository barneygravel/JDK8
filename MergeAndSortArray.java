package com.sap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeAndSortArray {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(5,3,2,1));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(4,5,7));

        ArrayList<Integer> result = mergeAndSortArray(a1, a2);
        System.out.println(result);
        Collections.sort(result);
        System.out.println("Sorted :");
        System.out.println(result);
    }

    private static ArrayList<Integer> mergeAndSortArray(ArrayList<Integer> a1, ArrayList<Integer> a2) {
        a1.addAll(a2);
        return a1;
    }
}
