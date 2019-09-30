package com.generics_new;

public class GenericFactory<T> {
    private Class theClass;

    public GenericFactory(Class theClass) {
        this.theClass = theClass;
    }

    public T createInstance() throws IllegalAccessException, InstantiationException {
        return (T) this.theClass.newInstance();
    }
}
