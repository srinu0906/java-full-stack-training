package com.srinu;

import com.srinu.calculator;

class LambdaExpression {
    public static void main (String[] args) {
 
        Add add = (a,b) -> a+b;
        Subtract sub = (a,b) -> a-b;
        Multiply mul = (a,b) -> a*b;
        Divide div = (a,b) -> a/b;
 
        int x=10, y=5;
        System.out.println(add(x,y));
        System.out.println(sub(x,y));
        System.out.println(mul(x,y));
        System.out.println(div(x,y));
 
    }
}
