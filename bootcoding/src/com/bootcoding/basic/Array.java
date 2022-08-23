package com.bootcoding.basic;

public class Array {
    public static void main(String[] args) {
        int a[] = {10, 20, 30};
        int b[] = new int[5];
        b[0] = 10;
        b[1] = 5;
        b[2] = 3;
        b[3] = 7;
        String c[] = {"Apple", "Avocado", "Grapes", "Pineapple", "Watermelon"};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        for (int i = 4; i >= 0; --i) {
            System.out.println(c[i]);
        }
        // i<5 ; i=4, i=3, i = 2, i= 1, i=0, i=-1 < 5; c[-1]
        // 4 < 5;
        // 3 < 5;
        // 2 < 5;
        // 1 < 5;
        // 0 < 5;
        // -1 < 5;
        // -2 < 5;
        // -4881885 < 5
        // -1 < 5 -> true - c[-1] - not possible
        //ArrayIndexOutOfBoundsException - index value out of bound (range)
        // 0 to size of array
        // 0 to 4 (i < 0 and i > 4)
        // example 5
        int d[] = {10, 15, 20, 25, 35, 75, 80, 95};
        for (int i = 0; i < d.length; i++) {
            if (d[i] == 80) {
                System.out.println("found "+d[i]);
            }
        }
    }
}
//example4

