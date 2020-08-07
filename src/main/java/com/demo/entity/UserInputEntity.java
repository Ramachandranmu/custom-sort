package com.demo.entity;

public class UserInputEntity {

    private int buketSize;
    private int[] numArray;

    public UserInputEntity(int buketSize, int[] numArray) {
        this.buketSize = buketSize;
        this.numArray = numArray;
    }

    public int getBuketSize() {
        return buketSize;
    }

    public int[] getNumArray() {
        return numArray;
    }
}
