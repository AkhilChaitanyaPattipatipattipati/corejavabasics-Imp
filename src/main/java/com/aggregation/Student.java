package com.aggregation;

public class Student {
    int rollNumber;
    Address StdentAdrs;
    String  studentName;

    public Student(int roll, Address address, String name) {
        this.rollNumber = roll;
        this.StdentAdrs = address;
        this.studentName = name;
    }

    public static void main(String[] args) {
        Address ad =new Address ("15209 NE 15th lane","Bellevue","Washington",98007);
        Student student = new Student ( 9,ad,"Akhil");
        System.out.println (student.rollNumber);
        System.out.println (student.studentName);
        System.out.println (student.StdentAdrs.city);
        System.out.println (student.StdentAdrs.streetName);
        System.out.println (student.StdentAdrs.state);

    }
}
