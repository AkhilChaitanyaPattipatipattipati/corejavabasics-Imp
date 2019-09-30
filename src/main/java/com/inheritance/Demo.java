package com.inheritance;

import com.java8.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

       /* SearchCriteria searchCriteria=new SearchCriteria.SearchCriteriaBuilder ()
                .team ( new IntegerParameter<> ( Operator.GreaterThan,3000 ) )
                .testName ( new StringParameter<> ( Operator.Equls,"Ranga" ) )
                .build ();
        System.out.println (searchCriteria.team.getOperator ());
        System.out.println (searchCriteria.team.getValue ());*/


        List<Employee> l = new ArrayList<> (  );
        l.add ( new Employee ( 10,"ranga",10 ));
        l.add ( new Employee ( 20,"Akhil",30 ));
        System.out.println (l.remove ( 0 ));
    }
}
