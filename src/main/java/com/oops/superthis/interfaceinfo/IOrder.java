package com.oops.superthis.interfaceinfo;

public interface IOrder {
    //every method is public abstract in Interface by default
    //every variable is public static final in interface by default
    //we dont have any costructor in interface
    //no instance variable in interface
    //we may have default methods interface from java 1.8 onwards
    //static methods also allowed in interface from java1.8
    // public static final  int i=10;
    void addItem(Item item);
    double calculatePrice();
    default double totalPrice() {
        double price= calculatePrice();
        double tax= tax(price);
        return price+tax;
    }
    default double tax(double price){
       return  price*12/100;
    }

    public static void print(){
        System.out.println("iam in IorderInfo");
    }


}
