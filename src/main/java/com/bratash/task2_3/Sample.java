package com.bratash.task2_3;

public class Sample
{
    ICalculator icalc;

    public Sample(ICalculator icalc){
        this.icalc = icalc;
    }

    public double add(double d1, double d2) {
        return icalc.add(d1, d2);
    }
}
