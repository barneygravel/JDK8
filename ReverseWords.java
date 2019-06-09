package com.sap;

public class ReverseWords {
    public static void main(String[] args) {
        String input= "I AM ABHINAV";
        String reversed = reverseWords(input);
        System.out.print(reversed);
    }

    private static String reverseWords(String s)
    {
        int length = s.length();
        int pointA;
        int pointB = length;
        StringBuilder result = new StringBuilder();

        for (int i = length-1; i>0 ; i--)
        {
            if(s.charAt(i) == ' ')
            {
                pointA = i+1;
                result.append(s, pointA, pointB).append(" ");
                pointB = i;
            }
        }
        result = result.append(s, 0, pointB);
        return result.toString();
    }
}
