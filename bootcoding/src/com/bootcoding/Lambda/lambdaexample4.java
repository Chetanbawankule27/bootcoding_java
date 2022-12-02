package com.bootcoding.Lambda;
public class lambdaexample4 {

    interface letdivide {
        int opertaion(int x);
    }
    private int operate (int x,int y,letdivide funcObject){

        return funcObject.opertaion( x);
    }

    public static void main(String[] args) {
        lambdaexample4.letdivide div = (x) -> x / 20;


        lambdaexample4 lambdaObject = new lambdaexample4();


        int result = lambdaObject.operate(100, 20, div);

        // Divide two numbers using lambda expression
        System.out.println("Divison is " + result);
    }

}


