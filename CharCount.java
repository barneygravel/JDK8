package com.sap;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        String input  = "aabbacccba";
        String output = charCount(input);
        System.out.println(output);
    }

    private static String charCount(String input) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] chars = input.toCharArray();
        StringBuilder s = new StringBuilder();

        for(int i=0; i< chars.length; i++)
        {
            if( !map.containsKey(chars[i]))
                map.put(chars[i], 1);
            else
                map.put(chars[i], map.get(chars[i]) + 1);
        }

        //map.forEach( (k,v) -> System.out.println("KEY: "+ k + " VALUE : " + v));

        for( Map.Entry<Character,Integer> entry : map.entrySet())
            s.append(entry.getKey()).append(entry.getValue());

        return s.toString();
    }
}
