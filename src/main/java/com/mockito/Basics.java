package com.mockito;

import com.predicate.Student;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class Basics {
    public static void main(String[] args) {
       Student s= mock( Student.class );

       when(s.getAge ()).thenReturn ( 20 );
       when(s.getGender ()).thenThrow ( new RuntimeException ( "Gender is not determined" ) );

      //  System.out.println (s.getGender ());

        Assert.assertEquals ( s.getAge (),Integer.valueOf ( 20));
        verify ( s,times ( 1 )).getAge ();

        CalculatorService cal=mock(CalculatorService.class);
        when(cal.add ( 20.0,20.0 )).thenReturn ( 50.0 );
        MyService m=new MyService ( cal );
        Double sum= m.add ( 20.0,20.0 );
        System.out.println (sum);



    }
}
