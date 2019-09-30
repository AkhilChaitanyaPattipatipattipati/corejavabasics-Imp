package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedListDemo {
    public static void main(String[] args) {
        List<Employee> employees=Arrays.asList(
                new Employee(1,"ranga",50),
                new Employee(2,"raju",20),
                new Employee(2,"kiran",10),
                new Employee(2,"murali",60),
                new Employee(4,"mohan",90)

        );
        List<Employee> sortedList=employees.stream ()
                                           .sorted ( Comparator.comparing ( employee -> employee.getDeptId () ) )
                                           .collect(Collectors.toList());
        sortedList.forEach ( System.out::println );
    }
}
