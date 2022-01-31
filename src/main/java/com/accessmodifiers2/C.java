package com.accessmodifiers2;

import org.apache.log4j.Logger;

public class C {

     static Logger log = Logger.getLogger(C.class.getClass());

     public int month;
     private int year;
     protected int day = 28;
     public int id;


     public void method3(){
         method4();
     }

     private void method4(){
         log.info("in method 4");
        // System.out.println("in method 4");
     }
}
