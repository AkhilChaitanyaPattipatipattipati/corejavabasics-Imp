package com.innerclasses_new.annonymous;

public class Demo2 {

    /**
     * Its an annonymous inner class its implements IOuter interface
     * new IOuter (){
     *
     * }
     * Here i is instance variable for Demo2
     */
    /*IOuter i=new IOuter () {
        @Override
        public void taste() {
            System.out.println ("taste1");
        }

        @Override
        public void m1() {
            System.out.println ("m11");
        }
    };*/

    public static void main(String[] args) {
        int k=10;
        Data<Integer> k1=new Data<> (10);
        IOuter i=new IOuter () {
            int y=50;
            @Override
            public void taste() {
                //k=20;
                System.out.println (this.y);
                k1.setT ( 20 );
                System.out.println (k1.getT ());
                System.out.println ("taste");
            }

           /* @Override
            public void m1() {
                System.out.println ("m1");
            }*/
        };
        int y=10;
        IOuter i2=()-> System.out.println ("tast2");
        i2=()->{
            k1.setT ( 20 );
            System.out.println (k1.getT ());
            System.out.println ("taste");

            System.out.println (y);
        };
      // new Demo2 ().i.taste ();
        //System.out.println (k);
        i.taste ();
        System.out.println (k1.getT ());

    }
}
