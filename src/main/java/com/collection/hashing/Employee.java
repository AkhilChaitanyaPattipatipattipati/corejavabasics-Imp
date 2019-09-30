package com.collection.hashing;

import java.util.Objects;

public class Employee {
    private Integer eid;
    private String eName;

    public Employee(Integer eid, String eName) {
        this.eid = eid;
        this.eName = eName;
    }

    public Integer getEid() {
        return eid;
    }

    public String geteName() {
        return eName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals ( getEid (), employee.getEid () );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( getEid () );
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", eName='" + eName + '\'' +
                '}';
    }
}
