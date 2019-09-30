package com.enumdemo;

public class Demo {
    int k=10;
    public static void main(String[] args) {
        //System.out.println (Day.SUNDAY.getName ());
         System.out.println ( Day.findDayByNumber(5) );
        // Day d= new Day();
        Demo d1=new Demo();
        Demo d3=new Demo();
        Demo d5=new Demo();
        d5.k=20;
        Demo d6=new Demo();
        Demo d7=new Demo();
        d6.m1();
        d7.m1 ();
        System.out.println ("d5.k  "+ d5.k );
        System.out.println ("d6.k before "+d6.k);
        d6.m2(d7);//Local variable Demo d=d7;
        System.out.println ("d6.k after="+d6.k);
        System.out.println ("d7.k "+d7.k);
        m3(d5);
        System.out.println ("d7.k after static "+d7.k);
        System.out.println ("d5.k after static  "+ d5.k );

    }
    public void m1(){
       this.k=20;//d6.k=20;   d7.k=20;
    }
    public void m2(Demo d) {
        this.k=50;//d6.k=50
        d.k = 25;//d7.k=25
        d=null;
    }
    public static void m3(Demo d){
        d.k = 100;//d5.k=100
    }
}
