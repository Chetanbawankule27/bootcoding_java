package com.bootcoding.basic;

public class Employee {
    String name;
    double experience;
    double salary;
    String technology;

    void workprofile(){
        System.out.println("works on"+technology);
    }

    public static void main(String[] args) {
        Employee chetan=new Employee();
        chetan.workprofile();
    }
}
