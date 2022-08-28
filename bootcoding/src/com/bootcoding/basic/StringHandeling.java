package com.bootcoding.basic;

import jdk.swing.interop.SwingInterOpUtils;

public class StringHandeling {
    public static void main(String[] args) {
        //example 1   LENGTH
        String s1 = "babulal";
        int l = s1.length();
        System.out.println(l);

        //example 2  EQUALS
        boolean b = s1.equals("babulal");
        System.out.println(b);
        System.out.println(s1.equals("Babulal"));

        //example 3  TRIM
        String s2 = "  Raja ";
        String s3 = s2.trim();
        System.out.println(s3);
        System.out.println(s2);

        //example 4  UPPERCASE
        String s4 = "Banti";
        s4 = s4.toUpperCase();
        System.out.println(s4);

        //example 5 LOWERCASE
        s4 = s4.toLowerCase();
        System.out.println(s4);

        //example 6 SPLIT
      //  String s5 = "My,Name,is,Raja";
    //    s5[] =s5.split(",");
     //   for ( int i = 0; i = s5.length; i++) {
    //    }
    //   System.out.println(s5[i]);

        //example 7 SUBSTRING
        String s5= "Ramayan";
        System.out.println(s5.substring(2));
        System.out.println(s5.substring(2,6));

        //example 8 IGNORE CASE
        System.out.println(s5.equalsIgnoreCase("ramayan"));

        //example 9 STANDS WITH & ENDS WITH
        System.out.println(s5.startsWith("Ram"));
        System.out.println(s5.startsWith("maya"));
        System.out.println(s5.startsWith("ram"));

        System.out.println(s5.endsWith("yan"));

        //example 10 CHAR AT
        System.out.println(s5.charAt(2));
        System.out.println(s5.charAt(5));
    }
}
