package com.streams;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionalProgramming {
    public static void main(String[] args) {
      /*Function<Integer,String> fun=*/new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return String.valueOf(integer*integer);
            }
        };
    /*    out.println(fun.apply(10));
        out.println(fun.apply(11));
        out.println(fun.apply(12));*/
        Function<Integer,String> fun1=integer->String.valueOf(integer*integer);
      /*  fun1=integer->String.valueOf(integer*integer*integer);
        fun1.apply(200);

        List<String> result= Arrays.asList(10, 11, 12).stream().map(fun1).collect(Collectors.toList());
        for (String s : result) {
            System.out.println(s);
        }*/
/*
        Function<Integer,String> fun1=integer->String.valueOf(integer*integer);
       Consumer<String> stringConsumer= s-> System.out.println(s);
        Arrays.asList(10, 11, 12).stream().map(fun1).forEach(stringConsumer);*/

        Arrays.asList(10, 11, 12).stream().map(e->String.valueOf(e*e)).forEach(r-> System.out.println(r));

    }
}
