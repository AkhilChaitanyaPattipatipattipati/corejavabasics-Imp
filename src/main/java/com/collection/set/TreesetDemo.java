package com.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetDemo {
    public static void main(String[] args) {
       // TreeSet t=new TreeSet();
        //only homogenious and comparable  objects can hold
        //duplicates not allowed
        //insertion order is not preserved it will insert based on sorting order
        //red black tree data structure
        // t.add(5);
        /*t.add(1);
        t.add(3);
        t.add(4);
        t.add(6);
        t.add(8);
        t.add(7);
        t.add(2);*/
       // t.add("ranga");
      // t.add(new StringBuffer("A"));
        /*t.add(new Employee(10,"ranga10"));
        t.add(new Employee(3,"ranga3"));
        t.add(new Employee(5,"ranga5"));
        t.add(new Employee(1,"ranga1"));*/
       // StringBufferComparator sb=new StringBufferComparator();
        /*Comparator<StringBuffer> sb=(StringBuffer o1,StringBuffer o2)->{
            String s1=o1.toString();
            String s2=o2.toString();
            Integer i1= s1.length();
            Integer i2= s2.length();
            if(i1<i2){
                return -1;
            }else if(i1==i2){
                return 0;
            }else{
                return 1;
            }
        };*/
    //    EmployeeSalaryComparator salaryComparator=new EmployeeSalaryComparator();
        /*TreeSet<StringBuffer> t=new TreeSet<>(sb);
        t.add(new StringBuffer("AEBCC"));
        t.add(new StringBuffer("BBBA"));
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("DZ"));
        t.add(new StringBuffer("C"));

        System.out.println(t);*/
       /* EmployeeIdComparator idComparator=new EmployeeIdComparator();*/
        Comparator<Employee> idComp=(Employee e1,Employee e2)->{
          return  e1.getId()<e2.getId() ? -1 : e1.getId()==e2.getId()? 0 : 1;
        };
        Comparator<Employee> salaryComp=(Employee e1,Employee e2)-> {
            return e1.getSalary() < e2.getSalary() ? -1 : e1.getSalary() == e2.getSalary() ? 0 : 1;
        };
        TreeSet<Employee> t1=new TreeSet<>(idComp);

        t1.add(new Employee(3,"ranga3",100));
        t1.add(new Employee(10,"ranga10",10000));
        t1.add(new Employee(5,"ranga5",10));
        t1.add(new Employee(1,"ranga1",1));

        System.out.println(t1);
    }
}
