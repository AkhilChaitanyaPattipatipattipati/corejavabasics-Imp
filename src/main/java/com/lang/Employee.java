package com.lang;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void m1() {
        System.out.println ( this.name );
    }

   /* @Override
    public int hashCode() {

        return Objects.hash ( getId (), getName () );
    }*/

    @Override
    public int hashCode() {

        return Objects.hash ( name );
    }

    public boolean equals(Object o) {

        Employee e1 = this;
        Employee e2 = (Employee) o;
        return (e1.id == e2.id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
