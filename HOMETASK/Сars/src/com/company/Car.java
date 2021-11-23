package com.company;

import java.util.Stack;

public class Car {
    private final String name;
    TrunkCapacity tc;
    private int cost, mileage;
    private final float fuelConsumption;
    Stack<Integer> currentWorkload;

    public Car(String name, int cost, int mileage, float fuelConsumption) {
        this.name=name;
        this.cost = cost;
        this.mileage = mileage;
        this.fuelConsumption = fuelConsumption;
        tc=TrunkCapacity.EMPTY;
    }

    public int getCost() {
        return cost;
    }

    public int getMileage() {
        return mileage;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }
    public String getName(){
        return name;
    }

    //some extra methods
    public void putLuggage() {
        int occupiedSpace = currentWorkload.stream().mapToInt(Integer::intValue).sum();
        if (occupiedSpace + 1 <= tc.getSpaceAvailable()) {
            currentWorkload.push(1);
            System.out.println("You put the luggage in");
        } else {
            System.out.println("There's no place to put smth");
        }
    }

    public void takeLuggage() {
        if (!currentWorkload.empty()) {
            currentWorkload.pop();
            System.out.println("You took the luggage out");
        } else {
            System.out.println("Oops, there's nothing there");
        }
    }
    //Couldn't make the code more concise :(
    @Override public String toString() {
        String type;
        String packageAndType = getClass().getName();
        switch (packageAndType) {
            case ("com.company.Hatchback"):
                type = "Hatchback";
                break;
            case ("com.company.Sedan"):
                type = "Sedan";
                break;
            case ("com.company.Estate"):
                type = "Estate";
                break;
            case ("com.company.Car"):
                type = "Empty";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + packageAndType);
        }
        return this.getName() + " (" + type + ")";
    }
}