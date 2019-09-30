package com.streams;

import com.collection.set.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamDemo {
    public static void main(String[] args) {
        List l1 = Arrays.asList(1, 2, 3, 4, 5, 6);
       // l.stream().forEach();
        StreamDemo s = new StreamDemo();
        //we have to pass employee object
        Employee emp = new Employee(10, "ranga", 12000);
        s.m1(emp, 10, l1);
        //range of integer  +2147483647   to -2147483648
        //primitive,object ,collection  return types also same*/


        List l = Arrays.asList(1, 2, 3, 4, 5, 6);
      /*  Consumer<Integer> consumer=  new Consumer<Integer>(){

            @Override
            public void accept(Integer i) {
                System.out.println("number is "+i);
            }
        };
        Consumer<Integer> con=i-> System.out.println("number is "+i);*/

        l.stream().forEach(i -> System.out.println("number is " + i));
        List<Employee> list = Arrays
                .asList(
                        new Employee(10, "Mahalakshmi", 2000),
                        new Employee(11, "Akhil", 2000),
                        new Employee(12, "Sesi", 2000),
                        new Employee(13, "Venkat", 2000),
                        new Employee(14, "Madhavi", 2000),
                        new Employee(15, "Somaiah", 2000)
                );
       /* List<Employee> list1=Arrays
                .asList(
                        new Employee(10,"ranga",2000),

                        new Employee(15,"ranga",2000)
                );
        List<Employee> list2=Arrays//var arg method it can allow 0 or n number of employees as method  parameters
                .asList(
                        new Employee(10,"ranga",2000)
                );
        List<Employee> list3=Arrays
                .asList(

                );*/
        new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.println(employee);
            }
        };
        list.stream().forEach(employee -> System.out.println(employee));
    }

    public void m1(Employee e, int k, List m) {
        System.out.println(e);
        System.out.println(m);
    }
}
