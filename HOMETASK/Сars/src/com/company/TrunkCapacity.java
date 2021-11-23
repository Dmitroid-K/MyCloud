package com.company;

//"Вместительность багажника"...
//this is a feature of each child class
public enum TrunkCapacity {
    EMPTY(0), LOW(1), MEDIUM(2), HIGH(3);

    private final int spaceAvailable;

    TrunkCapacity(int spaceAvailable) {
        this.spaceAvailable = spaceAvailable;
    }

    public int getSpaceAvailable() {
        return spaceAvailable;
    }
}
