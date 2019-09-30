package com.reflection;

import com.predicate.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c1 = Class.forName ( "com.reflection.Demo" );
      //  Class c2 = Class.forName ( "com.predicate.Student" );
        Class c3 = Class.forName ( "com.predicate.Student" );
        m1(c1);
       // m1(c2);
        m1(c3);
    }
   private static void  m1(Class<Object> c) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
       //using reflection we created an object for Demo class
       if(c.isInstance ( new Student() )){
         Constructor con=c.getDeclaredConstructor ( Integer.class, String.class ) ;
         Object o=con.newInstance ( 10,"ranga" );
           //fully qualified  name of demo class
           System.out.println (o.toString ());
           //demo class object hashcode
           System.out.println (o.hashCode ());
         return;
       }
       Object o= c.newInstance ();
       //fully qualified  name of demo class
       System.out.println (o.toString ());
       //demo class object hashcode
       System.out.println (o.hashCode ());
    }

    @Override
    public String toString() {
        return "Demo{}";
    }
}
