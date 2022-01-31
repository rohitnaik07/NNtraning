package com.abstraction.accessmodifiers1;

public class A {
     public int number;
    private int id;
    protected int height;


    public void method1() {
        method2();
    }

    private void method2(){
        System.out.println("in method2");
    }

}
