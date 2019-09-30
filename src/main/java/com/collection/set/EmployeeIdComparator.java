package com.collection.set;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return   e1.getId()<e2.getId() ? -1 : e1.getId()==e2.getId()? 0 : 1;
    }
}
