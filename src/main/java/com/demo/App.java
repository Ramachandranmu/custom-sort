package com.demo;

import com.demo.entity.UserInputEntity;
import com.demo.exception.InvalidInputException;
import com.demo.service.CustomSortService;
import com.demo.service.InputService;
import com.demo.service.OutputService;
import com.demo.validator.CustomSortInputValidator;

public class App {

    public static void main(String[] args) {
        // Prepare and inject beans
        CustomSortInputValidator inputValidator = new CustomSortInputValidator();
        InputService inputService = new InputService(inputValidator);
        CustomSortService customSortService = new CustomSortService();
        OutputService outputService = new OutputService();

        // Get User Input Pojo
        UserInputEntity inputEntity = null;
        try {
            inputEntity = inputService.getUserInput();
        } catch (InvalidInputException exception) {
            // Print Error to Console
            outputService.printOutput(exception);
            System.exit(1);
        }

        int[] customSortedValues = new int[0];

        customSortedValues = customSortService.customSort(inputEntity);


        // Print Output to Console
        outputService.printOutput(customSortedValues);
    }
}
