package com.java8;

import java.util.Objects;

public class Employee{
    private Integer eId;
    private String  eName;
    private Integer deptId;

    public Employee(Integer eId, String eName, Integer deptId) {
        this.eId = eId;
        this.eName = eName;
        this.deptId = deptId;
    }


   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals ( geteId (), employee.geteId () );
    }*/

   @Override
   public boolean equals(Object o){
      // Employee e1=(Employee)o;
       int eId1=this.eId;
       String eName1=this.eName;
       int depId1= this.deptId;
       Employee e2= (Employee)o;
       int  eId2 = e2.eId;
       String eName2=e2.eName;
       int dep2=e2.deptId;
       if(eId1==(eId2)&& eName1.equals ( eName2 ) ){
           return true;
       }else {
           return false;
       }
   }



    @Override
    public int hashCode() {

        return Objects.hash ( geteId (),geteName () );
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", deptId=" + deptId +
                '}';
    }



}
