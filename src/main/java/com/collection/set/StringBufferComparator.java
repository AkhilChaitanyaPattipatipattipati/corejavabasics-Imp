package com.collection.set;

import java.util.Comparator;

public class StringBufferComparator implements Comparator<StringBuffer> {
    @Override
        public int compare(StringBuffer o1, StringBuffer o2) {
        String s1=o1.toString();
        String s2=o2.toString();
        Integer i1= s1.length();
        Integer i2= s2.length();
        if(i1<i2){
            return -1;
        }else if(i1==i2){
            return 0;
        }else{
            return 1;
        }

    }
}
