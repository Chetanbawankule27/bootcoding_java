package com.bootcoding.basic;

public class Human {
        int hands;
        int legs;
        int nose;

        void eat(){
            System.out.println("EAT");
        }
        void sleep(){
            System.out.println("SLEEP");
        }
        void study(){
            System.out.println("STUDY");
        }
        void print() {
            System.out.println(hands);
            System.out.println(legs);
            System.out.println(nose);
        }
    public static void main(String[] args) {
        Human chetan =new Human();
        chetan.hands=2;
        chetan.legs=2;
        chetan.nose=1;
        chetan.eat();
        chetan.sleep();
        chetan.study();
        chetan.print();
    }
}