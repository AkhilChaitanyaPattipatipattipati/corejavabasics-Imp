package com.mockito;

public class MyService {
    private CalculatorService calcService;

    public MyService(CalculatorService calcService) {
        this.calcService = calcService;
    }
    public double add(double input1, double input2){
        return calcService.add(input1, input2);
    }
}
