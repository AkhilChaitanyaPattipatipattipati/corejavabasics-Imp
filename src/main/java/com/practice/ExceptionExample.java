package com.practice;

public class ExceptionExample {
    public  void m1(){
        try{
            System.out.println (10/0);
        }catch (Exception e){
            e.printStackTrace ();
          //  e.getMessage ();
           // e.toString ();
         //   System.out.println (10/2);
        }

    }

    public static void main(String[] args) {
        ExceptionExample e=new ExceptionExample ();
        e.m1 ();
    }

}
