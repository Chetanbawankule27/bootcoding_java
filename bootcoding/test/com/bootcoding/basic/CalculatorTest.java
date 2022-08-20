package com.bootcoding.basic;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void test1(){
        Calculator calc=new Calculator();
        int add = calc.calculator(10, 20, "ADD");
        Assert.assertTrue(add==30);
    }
    @Test
    public void test2(){
        Calculator calc=new Calculator();
        int mul= calc.calculator(10, 20, "MUL");
        Assert.assertTrue(mul==200);
    }
    @Test
    public void test3(){
        Calculator calc=new Calculator();
        int sub= calc.calculator(10, 20, "SUB");
        Assert.assertTrue(sub==-10);
    }
    @Test
    public void test4(){
        Calculator calc=new Calculator();
        int div= calc.calculator(10, 20, "DIV");
        Assert.assertTrue(div==0);
    }
}
