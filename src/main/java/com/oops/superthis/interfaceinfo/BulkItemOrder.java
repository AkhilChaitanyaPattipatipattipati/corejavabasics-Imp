package com.oops.superthis.interfaceinfo;

import java.util.ArrayList;
import java.util.List;

public class BulkItemOrder implements IOrder {
    List<Item> items=new ArrayList<>();
    //Here method parameter  may be primitive may be user defined variable like object or any collection
    @Override
    public void addItem(Item item) {
       // this.item=item;
        this.items.add(item);
    }

    @Override
    public double calculatePrice() {
        double allItemPrices=0;
        for(Item item:items){
            allItemPrices=allItemPrices+  item.getPrice();
        }
        return allItemPrices;
    }

}
