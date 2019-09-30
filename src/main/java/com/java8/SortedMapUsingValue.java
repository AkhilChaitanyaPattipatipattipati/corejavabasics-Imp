package com.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortedMapUsingValue {
    public static void main(String[] args) {
        Map<String, Integer> namesByMarks = new HashMap<> ();
        namesByMarks.put ( "akhil", 100 );
        namesByMarks.put ( "ranga", 90 );
        namesByMarks.put ( "hari", 95 );
        namesByMarks.put ( "kiran", 80 );
        namesByMarks.put ( "ramu", 85 );
        //By using value we have to sort
        namesByMarks.entrySet ()
                    .stream ()
                    .sorted ( Comparator.comparing ( entry -> entry.getValue () ) )
                    .forEach ( e -> System.out.println ( e.getKey () + "  : " + e.getValue () ) );
        //By Using key we have to sort
        namesByMarks.entrySet ()
                    .stream ()
                    .sorted ( Comparator.comparing ( entry -> entry.getKey () ) )
                    .forEach ( e -> System.out.println ( e.getKey () + "  : " + e.getValue () ) );


    }
}
