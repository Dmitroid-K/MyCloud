package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Park {
    private int spotsOccupied=0;
    private int totalCost;
    private final Car[] lots;
    public Park(int capacity){
        lots = new Car[capacity];
         //I had to fill in the spaces, otherwise a NullPointerException was thrown
         for (int i=0;i<capacity;i++){
             lots[i]=new Car("Parking lot",0,0,0);
         }
    }
    public Car[] getLots(){
        return lots;
    }
    public Car getCarFromLot(int index){
        return lots[index];
    }
    public void addCar(Car car){
        lots[spotsOccupied]=car;
        spotsOccupied++;
        totalCost+=car.getCost();
    }
    public void removeCar(int index){
        if (index>=0 && index<lots.length){
            totalCost-=lots[index].getCost();
            lots[index]=new Car("Parking lot", 0,0,0);
            spotsOccupied--;
        }
    }


    public int getTotalCost(){
        return totalCost;
    }
    public Car[] findByMileage(int from, int to){
        return Arrays.stream(lots).filter(x->x.getMileage()>=from && x.getMileage()<to).toArray(Car[]::new);
    }
    public Car[] sortByFuelConsumption(){
        return Arrays.stream(lots).sorted(Comparator.comparing(Car::getFuelConsumption)).toArray(Car[]::new);
    }
}
