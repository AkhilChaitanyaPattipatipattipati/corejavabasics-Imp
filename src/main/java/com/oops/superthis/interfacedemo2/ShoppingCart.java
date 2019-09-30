package com.oops.superthis.interfacedemo2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> l=new ArrayList<>();

    public void addItem(Item item){
        l.add(item);
    }
    public  int calculate() {
        ShoppingCartVisitor shoppingCartVisitor=new ShoppingCartVisitorImpl();
        int sum=0;
        for(Item item:l){
            sum=sum+item.accept(shoppingCartVisitor);
        }
        return sum;
    }
}
