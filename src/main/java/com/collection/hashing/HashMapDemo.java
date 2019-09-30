package com.collection.hashing;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Employee,String> hashSet=new HashMap<> (  );
        Employee e1=new Employee ( 10,"ranga" );
        Employee e2= new Employee ( 10,"Akhil1" );


      /*  System.out.println (e1.hashCode ());
        System.out.println (e2.hashCode ());//Obect class hashcode will use  JVM  generted but we cn ovverride hashcode method based oncontent
        System.out.println (e1.equals ( e2 ));//Object class equals  method will use ==// we can ovvirride equals method based on conntent comparision
        hashSet.put (e1,"ranga"  );
        hashSet.put (e2,"akhil" );
        //if we add duplicate key then old value will be replce with new value*/
       HashMap<Integer,Employee> employeeMap=new HashMap<> (  );
       employeeMap.put (e1.getEid (),e1  );
       employeeMap.put ( e2.getEid (),e2);
       System.out.println (employeeMap);
    }
}
