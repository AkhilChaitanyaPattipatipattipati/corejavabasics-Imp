package com.innerclasses_new.annonymous;

public class Demo {
    /**
     * new Outer(){
     *     //blah ....
     * };
     * above statement tells  about creating  annonymous inner class object for Outer(normal) class
     *
     * Here o1 is instance variable to demo class
     */
    //Outer o2=new Outer();
    Outer o1=new Outer(){
        //This area is child class of Outer with out extends keyword
        @Override
        public void taste() {
            System.out.println ("annoanymous inner class taste method");
        }

        @Override
        public void m1() {
            System.out.println ("child class m1");
        }
    };
    static  Demo d1=new Demo ();




    public static void main(String[] args) {
      new Demo().o1.m1 ();
    }
}
