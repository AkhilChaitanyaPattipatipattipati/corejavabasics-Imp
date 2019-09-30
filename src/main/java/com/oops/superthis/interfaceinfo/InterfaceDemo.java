package com.oops.superthis.interfaceinfo;

public class InterfaceDemo {
    public static void main(String[] args) {
        IOrder order=new BulkItemOrder();
       // order.addItem(new Item("laptop",25000));
        order.addItem(new Item("Iphone",70000));
       // order.addItem(new Item("T-Shirt",5000));

       /* IOrder  order2=new BulkItemOrder();
        order2.addItem(new Item("laptop",25000));
        order2.addItem(new Item("Iphone",70000));*/


        System.out.println(order.totalPrice());
      //  System.out.println(order2.totalPrice());

        IOrder order3=new SingleItemOrder();
        order3.addItem(new Item("Iphone",70000));
        System.out.println(order3.totalPrice());

    }
}
