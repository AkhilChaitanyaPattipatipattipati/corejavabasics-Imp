package com.cache;

import com.java8.Employee;

public class Test {
    public static void main(String[] args) {
        Employee e1=new Employee ( 1,"ranga1",10 );
        Employee e2=new Employee ( 2,"ranga2",10 );
        Employee e3=new Employee ( 3,"ranga3",10 );
        Employee e4=new Employee ( 4,"ranga4",10 );
        Employee e5=new Employee ( 5,"ranga5",10 );
        Employee e6=new Employee ( 6,"ranga6",10 );
        LRUCache<Integer,Employee> cache=LRUCache.newInstance ( 3 );
        cache.put ( e1.geteId (),e1 );
       // System.out.println (cache);
        cache.put ( e2.geteId (),e2 );
       // System.out.println (cache);
        cache.put ( e3.geteId (),e3 );
        System.out.println (cache);
        cache.put ( e4.geteId (),e4 );
        System.out.println (cache);
        cache.put ( e5.geteId (),e5 );
        System.out.println (cache);
        cache.put ( e6.geteId (),e6 );
        System.out.println (cache);


    }
}
