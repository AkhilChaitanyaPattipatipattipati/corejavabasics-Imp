package com.exception.checkedUncheked;

public class Test3 {
    public static void main(String[] args) {
      /*  try {
            System.out.println(add(10, -20));

        }catch (InvalidInputException e){
            e.printStackTrace ();
           System.out.println(e.getLocalizedMessage ());
        }*/
        System.out.println (new Test3().m1 ());
    }
    public static  int add(int a,int b){
        if(a<0||b<0){
            throw new InvalidInputException("a and b should be grater than 0 but  a="+a+" b="+b);
        }
        return a+b;
    }
    public int m1(){
        try{
            System.out.println ("try");
            int i= 10/0;
            //return 1;
        }catch(ArithmeticException e){
            System.out.println ("catch");
            throw e;

        }finally{
            System.out.println ("finally");

        }
        return 3;
    }
}
