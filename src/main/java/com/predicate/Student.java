package com.predicate;

import java.util.function.Function;

public class Student {
    public Integer age;
    public String gender;
    //Default constructor
    public Student(){

    }
    public Student(Integer age,String gender){
        this.age = age;
        this.gender = gender;
    }
    public  String customShow(Function<Student,String> fun){
        return fun.apply(this);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
