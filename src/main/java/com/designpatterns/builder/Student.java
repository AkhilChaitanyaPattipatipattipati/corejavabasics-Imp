package com.designpatterns.builder;
//Builder pattern used for making complex object very easy
public class Student {
    private final  String sName;
    private  final Integer sNo;

    private Student(Builder builder) {
       this.sName=builder.sName;
       this.sNo=builder.sNo;
    }

    public String getsName() {
        return sName;
    }

    public Integer getsNo() {
        return sNo;
    }

    public   static class  Builder{
        private   String sName;
        private   Integer sNo;

        public Builder setsName(String sName) {
            this.sName = sName;
            return this;

            //here this means which instance(object) is used for calling setSName(current method)
            //any class may have n number of instances(objects) so here we need to know which object it is

        }

        public Builder setsNo(Integer sNo) {
            this.sNo = sNo;
            return this;
        }
        //need to create student object by calling private constructor of student class
        public Student build(){
            Student.Builder sb=this;
            return new Student(sb);
        }
    }
}
