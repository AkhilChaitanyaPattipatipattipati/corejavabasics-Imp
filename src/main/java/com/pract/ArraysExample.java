package com.pract;

public class ArraysExample {

    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 3};

        System.out.println ( myList.length );

       /* for (int q:myList) {
            System.out.println (q);
        }*/
       /* int[] b={10,20,30,40};
        int[] a=new int[4];
        a[0]=10;
        a[1]=20;
        a[2]=30;*/
        String s = "bhaskar";
        // System.out.println(s.length);//C.E:cannot find symbol
        System.out.println ( s.length () );//7

        ArraysExample arrays = new ArraysExample ();
        arrays.m1 ();
    }


    public void m1() {
        int[] a = new int[10];
        a[0]= 1;
        a[1]= 101;
    }

}

