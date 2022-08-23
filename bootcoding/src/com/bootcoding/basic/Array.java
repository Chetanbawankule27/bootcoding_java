package com.bootcoding.basic;

public class Array {
    public static void main(String[] args) {
        int a[]={10,20,30};
        int b[] = new int[5];
        b[0] =10;
        b[1] =5;
        b[2] =3;
        b[3] =7;
        String c[]={"Apple","Avocado","Grapes","Pineapple","Watermelon"};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
            for(int i=0;i<b.length;i++){
                System.out.println(b[i]);
            }
            for(int i=4;i<c.length;--i){
            System.out.println(c[i]);
        }

    }
}
