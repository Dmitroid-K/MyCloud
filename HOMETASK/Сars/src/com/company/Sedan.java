package com.company;

import java.util.Stack;

import static com.company.TrunkCapacity.MEDIUM;

public class Sedan extends Car{

    public Sedan(String name, int cost, int mileage, float fuelConsumption) {
        super(name, cost, mileage, fuelConsumption);
        tc= MEDIUM;
        currentWorkload = new Stack<>();
    }
}
