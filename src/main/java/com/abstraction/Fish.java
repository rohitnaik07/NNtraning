package com.abstraction;

public abstract class Fish extends Sea {

    public Fish(){
        System.out.println("default constructor of FishClass");
    }

    public  String seatype1(){
        return "overriden method seatype1";
    }

    public abstract String seatype2();

    public abstract String seatype3();

}
