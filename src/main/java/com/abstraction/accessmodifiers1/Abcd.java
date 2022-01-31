package com.abstraction.accessmodifiers1;

import com.accessmodifiers2.*;

public class Abcd {
    public static void main(String[] args) {
        A object = new A();
        object.number=8;

        //object.id=1000;
        //object.method2();
        //object.method1();

        C object2 = new C();
        object2.month = 2;
        //object2.day

        D object3 = new D();
        object3.show();
        object3.method3();
    }
}
//Private: Class specific
//Default: Package specific
//Public: Any Class or Package
//Protected: Subsiding Class
