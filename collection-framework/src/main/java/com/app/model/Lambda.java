package com.app.model;

import java.util.ArrayList;

import static org.graalvm.compiler.debug.TTY.print;

public class Lambda {
    public static void main(String[] args) {

    }

    public void test() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        for (int i = 0; i < list.size(); i++) {
            print(list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            square(list.get(i));

        }
    }
}
