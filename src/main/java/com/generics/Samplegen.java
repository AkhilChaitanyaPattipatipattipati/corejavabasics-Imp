package com.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Samplegen {
        public static void main(String args[]){
            ArrayList<String> list=new ArrayList<String>();
            list.add("rahul");
            list.add("jai");
//list.add(32);//compile time error

            String s=list.get(1);//type casting is not required
            System.out.println("element is: "+s);
           /* for (String s1:list) {
                System.out.println("s is:" +s1);
            }*/

            Iterator<String> itr=list.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    }

