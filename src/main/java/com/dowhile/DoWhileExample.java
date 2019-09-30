package com.dowhile;

public class DoWhileExample {
    public static void main(String[] args) {
       int a =1,b=2;

        /*do {
            System.out.println ( "hello" );
            a++;
        }
        while (a<=3);*/

        // it has to execute statements in do firsttime: it has to execute without condition chexck
        //secondtime onwards need to satisfy condition then only statements execute.

        while (a<=3){
            a++;
            System.out.println ("hello");
        }

    }




}

