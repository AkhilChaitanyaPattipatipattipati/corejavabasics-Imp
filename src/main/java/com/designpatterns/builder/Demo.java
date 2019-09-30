package com.designpatterns.builder;

public class Demo {
    public static void main(String[] args) {
        Student.Builder sb =new Student.Builder ();
        sb.setsName ( "akhil" );
        sb.setsNo ( 50 );

        Student.Builder sb1 =new Student.Builder ();
        Student.Builder sb2 =new Student.Builder ();
        Student.Builder sb3=new Student.Builder ();
        Student.Builder sb4 =new Student.Builder ();

     Student s=sb.build ();
    }
}
