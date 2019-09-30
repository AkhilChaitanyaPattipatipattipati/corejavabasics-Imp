package com.generics_new;

public class Bounded<T extends Pare> {
    private T t;

    public Bounded(T t) {
        this.t = t;
    }
    public T getData(){
        return t;
    }
}
