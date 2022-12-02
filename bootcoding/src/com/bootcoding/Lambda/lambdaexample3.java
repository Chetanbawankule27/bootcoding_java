package com.bootcoding.Lambda;

public class lambdaexample3 {
interface letdivide {
    int opertaion(int x, int y);
}
private int operate (int x,int y,letdivide funcObject){
    return funcObject.opertaion( x, y);
}

    public static void main(String[] args) {
        lambdaexample3.letdivide div = (x, y) -> x / y;


        lambdaexample3 lambdaObject = new lambdaexample3();

//used in single
        int result = lambdaObject.operate(100, 20, div);

        // Divide two numbers using lambda expression
        System.out.println("Divison is " + result);
    }

}
