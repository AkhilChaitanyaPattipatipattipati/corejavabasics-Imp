package com.oops.superthis.interfaceinfo;

import java.util.ArrayList;

public class SingleItemOrder  implements IOrder{
    ArrayList<Item> items=new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    //At the time of implementation of an interface we have to follow bellow things
    //we have to implement all abstract methods(mandatory)
    //we cant ovverride static methods which are there in interface
    //we can ovverride default method from interface that is optional

    @Override
    public double calculatePrice() {
        double allItemPrices=0;
        for(Item item:items){
            allItemPrices=allItemPrices+  item.getPrice();
        }
        return allItemPrices;
    }
    public double tax(double price){
        return  price*15/100;
    }
}
