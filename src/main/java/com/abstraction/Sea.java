package com.abstraction;

public abstract class Sea {
    public Sea(){
        System.out.println("default constructor of SeaClass");
    }

    public Sea(String name){
        System.out.println("para construct of SeaClass");
    }

    public abstract String seatype1();

    public abstract String seatype2();

    public abstract String seatype3();

}
