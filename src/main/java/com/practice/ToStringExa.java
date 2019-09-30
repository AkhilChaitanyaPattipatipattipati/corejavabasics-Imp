package com.practice;

import com.java8.Employee;

import java.util.HashSet;

public class ToStringExa {
    public static void main(String[] args) {
        HashSet  emp = new HashSet<> (  );
        Employee e1= new Employee ( 9,"ECE",9 );
        Employee e2= new Employee ( 999,"CSE",9 );
        emp.add ( e1 );
        emp.add ( e2 );
       // e1=e2;
        System.out.println (e1.equals ( e2 ));
    }



}
