package com.innerclasses_new.annonymous;

public class Data<T> {
    T t;

    public Data(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
