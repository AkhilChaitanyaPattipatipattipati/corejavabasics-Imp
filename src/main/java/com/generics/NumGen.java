package com.generics;

/**
 * This class (i mean d) can allow only Number and its child classes so we can say this class is bounded type class
 * @param <D>
 */

public class NumGen<D extends Number> {
    D t;
    NumGen(D t){
        this.t=t;
    }
    public D getValue(){
        return t;
    }
    public  Double multipliedBy10(){
        return t.doubleValue()*10;
    }
}
