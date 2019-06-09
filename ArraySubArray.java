package com.sap;

import java.util.Arrays;

public class ArraySubArray {

    public static void main(String[] args) {
        //testTryWithReturn1();

        int[] input = {3, 4, 7, 8, 2, 6, 1, 9};
        //int offset =3;
        int[] ar = printPattern(input);
        System.out.print(Arrays.toString(ar));
    }

    public static int[] printPattern(int[] array) {
        int length = array.length;
        int offset  = length/2;

        int[] a = Arrays.copyOfRange(array, 0, (length + 1)/2);
        int[] b = Arrays.copyOfRange(array, (length + 1)/2, length);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int[] result = new int[length];
        String s = null;

        /*for (int i =0; i<(length)/2; i=i+2)
        {
            result[i] = a[i];
            result[i+1] = b[i];

        }*/

        for (int i =0; i<offset; i++)
        {
            result[i] = array[i];
            result[i+offset] = array[i+offset];
            //s.append("a");
                    //.append(array[i+offset]);
            s.concat("array[i]");
            System.out.println(array[i]+ "," + array[i+offset]);

        }




        //result[0] = 3;
        return result;
    }


    public static int  testTryWithReturn1() {
        try {
            return 1;
        }
        finally {
            System.out.print("Done!");
        }
    }


}
