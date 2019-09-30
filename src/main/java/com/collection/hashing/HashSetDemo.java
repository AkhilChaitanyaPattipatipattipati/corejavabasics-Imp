package com.collection.hashing;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Employee> hashSet=new HashSet<> (  );
        Employee e1=new Employee ( 10,"ranga" );
        Employee e2= new Employee ( 10,"Akhil" );
        System.out.println (e1.hashCode ());
        System.out.println (e2.hashCode ());//Obect class hashcode will use  JVM  generted but we cn ovverride hashcode method based oncontent
        System.out.println (e1.equals ( e2 ));//Object class equals  method will use ==// we can ovvirride equals method based on conntent comparision
        hashSet.add (e1  );
        hashSet.add (e2 );

        System.out.println (hashSet);
    }
}
