package com.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class sampleExample2 {

    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "vijay");
        map.put(4, "umesh");
        map.put(2, "ankit");

//Now use Map.Entry for Set and Iterator
        Set<Map.Entry<Integer, String>> set = map.entrySet();

        for (Map.Entry<Integer, String> entry : set) {
            Integer k = entry.getKey();
            String M = entry.getValue();

            System.out.println("key is :"+k);
            System.out.println("Value is :"+M);
        }
    }
}

