package com.inheritance;

public enum Operator {
    Equls,
    NotEqulas,
    GreaterThan,
    LessThan;

    @Override
    public String toString() {
        return "Operator{}"+this.name ();
    }
}
