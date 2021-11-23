package com.company;

import java.util.Stack;

import static com.company.TrunkCapacity.HIGH;

public class Estate extends Car{

    public Estate(String name, int cost, int mileage, float fuelConsumption) {
        super(name, cost, mileage, fuelConsumption);
        tc= HIGH;
        currentWorkload = new Stack<>();
    }
}