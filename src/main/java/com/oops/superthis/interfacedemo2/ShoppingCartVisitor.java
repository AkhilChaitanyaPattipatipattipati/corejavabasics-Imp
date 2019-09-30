package com.oops.superthis.interfacedemo2;

public interface ShoppingCartVisitor {
    public int visit(Book book);
    public int visit(Fruit fruit);
}
