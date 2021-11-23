package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Park park = new Park(10);
        Car audiAIV = new Sedan("audiAIV",28000, 180000,1.8f);
        Car hyundaiAccent = new Hatchback("hyundaiAccent",34000, 44000, 1.6f);
        Car kiaOptimaIII = new Sedan("kiaOptima3",33000, 163000,2.0f);
        Car volkswagenJettaVI = new Sedan("volkswagenJettaVI", 30500, 41500,1.4f);
        Car fordFocusIII = new Hatchback("fordFocusIII", 24000,95000,1.0f);
        Car opelAstra = new Estate("opelAstra", 33500,160000,1.6f);
        Car skodaOctaviaIII = new Estate("skodaOctaviaIII", 31000,114000,1.8f);
        Car volvoS60II = new Sedan("volvoS60II", 27000, 210000,1.6f);
        Car bmw5 = new Sedan("bmw5", 26000,190000,3.0f);
        Car fordMondeoIII = new Estate("fordMondeoIII", 4500, 266000,1.8f);
        Car renaultSanderoIIStepway = new Hatchback("renaultSanderoIIStepway", 24000, 70000, 1.6f);

        park.addCar(audiAIV);
        park.addCar(hyundaiAccent);
        park.addCar(kiaOptimaIII);
        park.addCar(volkswagenJettaVI);
        park.addCar(fordFocusIII);
        park.addCar(opelAstra);
        park.addCar(skodaOctaviaIII);
        park.addCar(volvoS60II);
        park.addCar(bmw5);

        //testing remove method
        park.addCar(fordMondeoIII);
        park.removeCar(9);
        park.addCar(renaultSanderoIIStepway);

        //I made lists to easily display park to the console
        //show cars in the usual order
        System.out.println(Arrays.asList(park.getLots()));
        //other methods
        System.out.println("Total cost " + park.getTotalCost());
        System.out.println(Arrays.asList(park.findByMileage(30000, 50000)));
        System.out.println(Arrays.asList(park.sortByFuelConsumption()));

        //putting some luggage and extracting it
        System.out.println("\n");
        park.getCarFromLot(1).putLuggage();
        park.getCarFromLot(1).putLuggage();
        System.out.println("\n");
        park.getCarFromLot(1).takeLuggage();
        park.getCarFromLot(1).takeLuggage();

    }
}
