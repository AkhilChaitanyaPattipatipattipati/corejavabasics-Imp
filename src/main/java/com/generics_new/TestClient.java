package com.generics_new;

import com.collection.set.Employee;

import java.lang.reflect.InvocationTargetException;

public class TestClient {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        UnBounded<Integer> intData = new UnBounded<>(10);
        System.out.println(intData.getData());
        UnBounded<String> s = new UnBounded<>("ranga");
        System.out.println(s.getData());
        Bounded<Pare> b = new Bounded<>(new Child());
        System.out.println(b.getData());
       /* Class empClass=Employee.class;
        System.out.println(empClass.newInstance());

       GenericFactory<Employee> empObj = new GenericFactory<>(Employee.class);
        System.out.println(empObj.createInstance());
        */
        Class  c= Employee.class;
       // c.getMethods();
       /*Constructor[] con= c.getConstructors();
       Parameter[] parameter=con[0].getParameters();
       for(Parameter p:parameter){
           System.out.println(p.getType());
       }
       Object obj= con[0].newInstance(10,"ranga",20000);
        System.out.println(obj.toString());*/
        /*GenericFactory<Employee> testObjFactory = new GenericFactory<>(c);
        System.out.println(testObjFactory.createInstance());
        System.out.println(testObjFactory.createInstance());*/



    }
}
