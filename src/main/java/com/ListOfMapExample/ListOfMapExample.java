package com.ListOfMapExample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMapExample {

    public static void main(String[] args) {
        //If Employee class fields are growing drastically  then its always difficultadd fields in Employee class
        //then go for Map instead of Employee class
        Map<String, Object> akhil = new HashMap<> ();
        akhil.put ( "name","Akhil" );
        akhil.put ( "sno",1 );

        Map<String, Object> ranga = new HashMap<> ();
        ranga.put ( "name","Ranga" );
        ranga.put ( "sno",2 );
        ranga.put ( "permanent address","kurnool" );

        Map<String, Object> hari = new HashMap<> ();
        hari.put ( "name","Ranga" );
        hari.put ( "sno",3 );
        hari.put ( "permanent address","kurnool" );
        hari.put ( "current permanent address","hyderabad" );

        Map<String, Object> raja = new HashMap<> ();
        raja.put ( "name","Ranga" );
        raja.put ( "sno",3 );
        raja.put ( "salary",2000000750.10 );
        raja.put ( "permanent address","kurnool" );
        raja.put ( "current permanent address","hyderabad" );

        List<Map<String,Object>> data= Arrays.asList ( akhil, ranga, hari,raja);
        System.out.println (data);

    }
}
