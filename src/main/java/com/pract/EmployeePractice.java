package com.pract;

import com.java8.Employee;

import java.util.ArrayList;

public class EmployeePractice {

    public void m1(){
        ArrayList<Employee> emp = new ArrayList<> (  );

        Employee e1= new Employee ( 9, "Madhavi", 99 );

        Employee e2=new Employee ( 99, "Venkat Rao", 999 );
        emp.add ( e1 );
        emp.add ( e2 );
        emp.remove ( e1 );

        Employee Predicate=  emp.remove ( 0 );
        System.out.println (Predicate);

        for (Employee a: emp) {
            System.out.println (a);

        }

    }

    public static void main(String[] args) {
        EmployeePractice ep = new EmployeePractice ();
        ep.m1 ();

    }


}
