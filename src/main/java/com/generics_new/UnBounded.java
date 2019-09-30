package com.generics_new;

public class UnBounded<T> {
    private T t;

    public UnBounded(T t) {
        this.t = t;
    }
    public T getData(){
        return t;
    }
}
