package com.bootcoding.star.oops.polymorphism;

public class Newstar {
    public static void main(String[] args) {
        int b = 4;
        for (int i = 0; i < b; i++) {
            for (int j = b; j > i; j--) {

                System.out.print("*");
            }
            for (int l = 0; l < i * 2; l++) {
                System.out.print(" ");
            }
            for (int k = 0; k < b - i; k++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
