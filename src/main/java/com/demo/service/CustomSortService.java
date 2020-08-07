package com.demo.service;

import com.demo.entity.UserInputEntity;

import java.util.Arrays;

public class CustomSortService {

    public int[] customSort(UserInputEntity inputEntity) {
        int bucketSize = inputEntity.getBuketSize();
        int[] numArray = inputEntity.getNumArray();
        int[] numArrayCopy = Arrays.copyOf(numArray, numArray.length);
        Arrays.sort(numArrayCopy);
        int numOfBuckets = numArray.length / bucketSize;
        for (int i = 0; i < numArray.length; i = i + bucketSize) {
            int startIndex = i;
            int endIndex = i + bucketSize - 1;
            while (endIndex > startIndex) {
                int temp = numArrayCopy[startIndex];
                numArrayCopy[startIndex] = numArrayCopy[endIndex];
                numArrayCopy[endIndex] = temp;
                startIndex++;
                endIndex--;
            }
        }
        return numArrayCopy;
    }


}
