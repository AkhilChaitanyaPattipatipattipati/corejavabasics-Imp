package com.inheritance;

public abstract class Parameter<T> {
    private Operator operator;
    private T value;
    public Parameter(Operator operator,T value){
        this.operator=operator;
        this.value=value;
    }

    public Operator getOperator() {
        return operator;
    }

    public T getValue() {
        return value;
    }
}
