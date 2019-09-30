package com.practice;

import com.aggregation_new.Test;

import java.util.HashSet;
import java.util.Objects;

public class Person extends Test{

    String firstName;
    String lastName;

    @Override
    public boolean equals(Object o) {
        String firstName1=this.firstName;
        if(o instanceof Person){//inner object of o is any  person object or its child object are not i yes return trueelse it return false
            //A b=(C)d;
            //c and d should has some relationship either child to parent or parent to child

            //A is parent of C or same type

            //Inner object of D must be C or its child other wise we will get type cast exception

            //By using parent reference we can call only parent instance variables and methods
            //By using child class reference we can call child and parent instance variables and methods


            Person p=(Person)o;

            String firstName2=p.firstName;
            if(firstName1.equals ( firstName2 )) {
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }


    }


    @Override
    public int hashCode() {

        return Objects.hash ( firstName, lastName );
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public static void main(String[] args) {
        HashSet<Person> hashset =new HashSet<> (  );
        Person p1= new Person (  "Akhil","Pattipati");
        Person p2= new Person ( "Madhavi","pattipati" );
        p1.equals ( new Men ( "Akhil","Pattipati") ) ;
    }


}


class Men extends Person{

    public Men(String firstName, String lastName) {
        super ( firstName, lastName );
    }
}
