package com.demo.service;

import com.demo.entity.UserInputEntity;
import com.demo.exception.InvalidInputException;
import com.demo.validator.CustomSortInputValidator;

import java.util.Scanner;

public class InputService {

    private final CustomSortInputValidator inputValidator;
    private Scanner scanner = new Scanner(System.in);

    public InputService(CustomSortInputValidator inputValidator) {
        this.inputValidator = inputValidator;
    }

    public UserInputEntity getUserInput() throws InvalidInputException {
        System.out.println("Enter number of elements: ");
        int numOfElements = scanner.nextInt();
        System.out.println("Enter bucket size: ");
        int bucketSize = scanner.nextInt();
        inputValidator.validate(numOfElements, bucketSize);
        System.out.println("Enter array values: ");
        int[] numArray = new int[numOfElements];
        for (int i = 0; i < numOfElements; i++) {
            numArray[i] = scanner.nextInt();
        }
        return new UserInputEntity(bucketSize, numArray);
    }

}
