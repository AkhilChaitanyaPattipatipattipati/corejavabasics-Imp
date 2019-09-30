package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList (
                new Employee ( 1, "ranga", 10 ),
                new Employee ( 2, "raju", 20 ),
                new Employee ( 2, "kiran", 10 ),
                new Employee ( 2, "murali", 10 ),
                new Employee ( 4, "mohan", 10 )
        );


        /*List<Employee> newList = new ArrayList<> ();
        for (Employee temp : employees) {
            if (!newList.contains ( temp )) {
               // System.out.println (temp);
                newList.add ( temp );
            }
        }

        newList.forEach ( System.out::println );
*/
        Map<Integer, Employee> empMap = employees.stream ().collect ( Collectors.toMap (
                e -> e.geteId (),
                e -> e,
                (e1, e2) -> e2 )
        );

        empMap.values ().stream ().forEach ( System.out::println );
    }

}

