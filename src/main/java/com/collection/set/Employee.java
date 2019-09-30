package com.collection.set;


public class Employee implements Comparable<Employee> {
    public static int x =10;
    private int id;
    private String name;
    private Integer salary;

    public Employee() {

    }

    public Employee(int id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee e2) {
        Employee e1 = this;
        return e1.id < e2.id ? -1 : e1.id == e2.id ? 0 : 1;
       /* if(e1.id<e2.id){
            return -1;
        }else if(e1.id==e2.id){
            return 0;
        }else{
            return +1;
        }*/
    }
}
