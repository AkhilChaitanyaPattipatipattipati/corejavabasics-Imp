package com.generics;

/**
 * Example of Generic class and generic method
 * @param <D>
 */

public class GenEx<D> {
    private D d;
    public GenEx(D d){
        this.d=d;
    }
    public D getD(){
        return d;
    }

}
