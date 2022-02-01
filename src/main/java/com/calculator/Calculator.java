package com.calculator;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(24,25));
        System.out.println(sub(76.45f,39.96f));
        System.out.println( mult(2,3,4));
        System.out.println( div(10,5));
    }

    public static int add(int number1,int number2){
        return number1 + number2;
    }
    public static int add(int number1,int number2,int numbre3){
        return number1+number2+numbre3;
    }
    public static float add(float number1,float number2){
        return number1 + number2;
    }
    public static int sub(int number1,int number2){
        return number1-number2;
    }
    public static int sub(int number1,int number2,int numbre3){
        return number1-number2-numbre3;
    }
    public static float sub(float number1,float number2){
        return number1- number2;
    }
    public static int mult(int number1,int number2){
        return number1*number2;
    }
    public static int mult(int number1,int number2,int numbre3){
        return number1*number2*numbre3;
    }
    public static float mult(float number1,float number2){
        return number1*number2;
    }
    public static int div(int number1,int number2){
        return number1/number2;
    }
    public static int div(int number1,int number2,int numbre3){
        return number1/number2/numbre3;
    }
    public static float div(float number1,float number2){
        return number1/number2;
    }
}

