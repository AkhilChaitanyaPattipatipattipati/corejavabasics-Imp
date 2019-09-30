package com.pract;

public class FinalVariable extends ClassApplicableModifiers {

    public final int i =1;

    public static void main(String[] args) {
        FinalVariable f=new FinalVariable ();
        System.out.println ("i value is "+f.i);
        int i=f.i+10;
        System.out.println (i);
    }

    @Override
    public void m1() {
    }
}
