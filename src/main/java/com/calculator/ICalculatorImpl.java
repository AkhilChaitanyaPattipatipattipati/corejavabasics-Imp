package com.calculator;

public class ICalculatorImpl implements ICalculator{
    @Override
    public int add(int a, int b ){
      return a+b;
    }

    @Override
    public int subtraction(int a, int b) {
       return a-b;
    }

    @Override
    public int multiplication(int a, int b) {
         return a*b;
    }

    @Override
    public float division(float a, float b) {
       if(b!=0){
           return a/b;
       }else {
           throw new ArithmeticException ( "Divider should not be zero" );
       }
    }

    public static void main(String[] args) {
        ICalculator calc=new ICalculatorImpl ();
        System.out.println (calc.add ( 9,6 ));
        calc.subtraction ( 9,6 );
        System.out.println (calc.multiplication ( 9,6 ));
        System.out.println (calc.division ( -9,3));//devider  should not be zero
    }
}
