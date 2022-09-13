package com.bootcoding.star.oops;

public class StarApplication {
    public static void main(String[] args) {
        int a = 3;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int b = 3;
        for (int i = 1; i<=b; i++) {
            for (int j = b; j >i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}