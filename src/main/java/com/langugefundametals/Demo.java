package com.langugefundametals;

public class Demo {
    public static void main(String[] args) {
        m1("ranga",new Integer[]{});
        m1("akhil",new Integer[]{10,2});
        m1("raja", new Integer[]{10,20,30,40});
    }
    private static void m1(String name, Integer[] i){
        //from 1.5 version
        int sum=0;
       // Integer f=i[1];
      //  System.out.println (f);
        for(Integer n:i){
            sum=sum+n;
        }
        System.out.println ("name=  "+name+" sum= "+sum);
    }
}
