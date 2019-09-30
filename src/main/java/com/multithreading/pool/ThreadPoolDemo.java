package com.multithreading.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool ( 5);
        List<Future<Integer>> resultList=new ArrayList<> (  );
        for (int i=1;i<=10;i++){
          Future<Integer> result= executorService.submit ( new Task( i)  );
            System.out.println (result.get ());
            resultList.add ( result );

       }
       for(Future<Integer> result:resultList){
          // System.out.println (result.get ());
       }
       executorService.shutdown ();

    }
}
class Task implements Callable<Integer> {
    int i;
    Task(int i){
      this.i=i;

    }

    @Override
    public Integer call() {

        System.out.println ("task "+i +"started by"+Thread.currentThread ().getName ());
        try {
            Thread.sleep ( 1000 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        System.out.println ("task "+i +"completed by"+Thread.currentThread ().getName ());
        return 1000+i;
    }
}