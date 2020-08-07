package com.demo.service;

import com.demo.exception.InvalidInputException;

import java.util.Arrays;

public class OutputService {

    public void printOutput(int[] numArray) {
        System.out.println(Arrays.toString(numArray));
    }

    public void printOutput(InvalidInputException inputException) {
        System.out.println(inputException.toString());
    }
}
