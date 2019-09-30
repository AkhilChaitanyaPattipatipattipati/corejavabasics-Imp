package com.collection.set;

public class MyComparator implements java.util.Comparator<Test> {
    @Override
    public int compare(Test o1, Test o2) {
        return o1.getData ().compareTo ( o2.getData () );
    }
}
