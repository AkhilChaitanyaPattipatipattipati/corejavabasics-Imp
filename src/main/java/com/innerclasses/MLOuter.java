package com.innerclasses;

public class MLOuter {
    int x=1;

    public   void m1(){
        final int y=10;
        //final strictfp,abstract
         class MLInner{
             int z=100;
             public void m2(int a,int b){
                 int z=1000;
                 System.out.println(x);
                 System.out.println(y);
                 System.out.println(this.z);
                 System.out.println(z);
                 System.out.println(a+b);
             }
        }
        MLInner ml=new MLInner();
        ml.m2(10,20);
        ml.m2(100,200);
    }
}
