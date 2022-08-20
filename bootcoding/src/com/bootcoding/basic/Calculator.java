package com.bootcoding.basic;

public class Calculator {
  //  public static void main(String[] args) {
      //  System.out.println(calculator(10, 20, "ADD"));
   //     System.out.println(calculator(10, 20, "MUL"));
    //    System.out.println(calculator(10, 20, "SUB"));
      //  System.out.println(calculator(10, 20, "DIV"));

     int calculator(int a, int b, String action) {
        if (action == "ADD") {
            return a + b;
        } else if (action == "MUL") {
            return a * b;
        } else if (action == "SUB") {
            return a - b;
        } else if (action == "DIV") {
            return a / b;
        }
        return a;
    }

}