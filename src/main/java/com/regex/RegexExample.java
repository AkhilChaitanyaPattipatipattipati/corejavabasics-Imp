package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Pattern p=Pattern.compile ( "(0|91)?[8-9][0-9]{9}" );
        Matcher m=p.matcher ( args[0] );
        int count=0;
        if(m.find()&&m.group().equals(args[0])){
            System.out.println ("Valid");
        }
       // System.out.println (count);

    }
}
