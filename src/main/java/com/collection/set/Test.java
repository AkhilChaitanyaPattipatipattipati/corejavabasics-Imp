package com.collection.set;

public class Test {
    private Integer data;
    public Test(Integer data){
        this.data=data;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Test{" +
                "data='" + data + '\'' +
                '}';
    }

}
