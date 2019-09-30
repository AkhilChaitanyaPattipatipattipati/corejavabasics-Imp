package com.typecasting;

import java.util.ArrayList;
import java.util.List;

public class TypeCastDemo {
    public static void main(String a[]) {
        Object obj=new String("hai ranga");

        //by using child class reference we can call parent/chiild class methods

        //by using parent class reference we can call parent class methods
        //if we use type cast from parent to child then we can able to call child class methods also

        System.out.println ( ((String) obj). contains ( "hai1" ));
        List l= new ArrayList (  );
        
    }
}
