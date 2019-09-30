package com.generics;

/**
 * Here this class is the example of un bounded type
 * @param <D>
 */
public class Data<D> {
    D t;

    Data(D t) {
        this.t = t;
    }

    public D getValue() {
        return t;
    }

    public String valueType() {
        return t.getClass().getName();
    }
}
