package com.company;

import java.util.Stack;

import static com.company.TrunkCapacity.LOW;

public class Hatchback extends Car{

    public Hatchback(String name, int cost, int mileage, float fuelConsumption) {
        super(name, cost, mileage, fuelConsumption);
        tc= LOW;
        currentWorkload = new Stack<>();
    }
}