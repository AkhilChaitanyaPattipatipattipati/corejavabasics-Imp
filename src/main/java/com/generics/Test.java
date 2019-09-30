package com.generics;

import com.forloop.model.Employee;

public class Test {
    public static void main(String[] args) {
        GenEx<Employee> employeeGenEx=new GenEx<>(new Employee(10,"ranga",10000D));
       Employee e1= employeeGenEx.getD();

        GenEx<Student> studnStudentGenEx=new GenEx<>(new Student(10,"ranga"));
        Student s1= studnStudentGenEx.getD();

        NonGen nonGen=new NonGen();

        /*//its un bounded generic method
        Student s2=  nonGen.m1(new Student(10,"akhil"));
        Employee e2=  nonGen.m1(new Employee(10,"akhil",100000000D));


        //get value is bounded method so it can allow only  number or  number child class objects
       Integer i2= nonGen.getValue(new Integer(10));*/

       // Employee e3=  nonGen.getValue(new Employee(10,"akhil",100000000D));
    }
}
