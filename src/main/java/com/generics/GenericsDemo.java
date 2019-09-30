package com.generics;

import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String[] args) {
        //Step-0:

        Integer obj1=new Integer(100);


        Object obj2=new Integer(2000);
        Integer obj3=(Integer)obj2;
        System.out.println(obj3);


        //Step 1:
       /* ArrayList al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add("ranga");
        for (Object obj:al) {

            //instanceOf operator
            if(obj instanceof  Integer) {
                Integer i = (Integer) obj;
                System.out.println(i.intValue() * 10);
            }
            if(obj instanceof  String){
                System.out.println(obj.toString());
            }
        }*/

       ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        int k= al.get(1);
        System.out.println(k);

        ArrayList al1=new ArrayList<>();
        al1.add(1);
        al1.add(2);
        int j= (Integer)al1.get(1);
        System.out.println("data k="+k +" j="+j);

      /*  for (Integer i:al) {
            System.out.println(i.intValue()*10);
        }*//*
      Data<Integer> d1=new Data<>(10);
        System.out.println(d1.getValue());
        System.out.println(d1.valueType());
        Data<String> d2=new Data<>("ranga");
        System.out.println(d2.getValue());
        System.out.println(d2.valueType());*/

        NumGen<Integer>  intNum=new NumGen<>(20);
        System.out.println(intNum.multipliedBy10());
        NumGen<Double>  doubleNum=new NumGen<>(25D);
        System.out.println(doubleNum.multipliedBy10());

       // NumGen<String> stringGen=new NumGen<String>("ranga"); string is not a child class of Number thats why we are getting error

    }
}
