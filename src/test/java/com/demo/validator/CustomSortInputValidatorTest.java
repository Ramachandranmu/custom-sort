package com.demo.validator;

import com.demo.exception.InvalidInputException;
import org.junit.Assert;
import org.junit.Test;

public class CustomSortInputValidatorTest {

    CustomSortInputValidator inputValidator = new CustomSortInputValidator();

    @Test
    public void validate_HappyCase() throws InvalidInputException {
        inputValidator.validate(9, 3);
    }

    @Test
    public void validate_InvalidInputCase() throws InvalidInputException {
        String exceptionMsg = null;
        try {
            inputValidator.validate(9, 5);
        } catch (Exception exception) {
            exceptionMsg = exception.toString();
        }
        Assert.assertEquals("Invalid Input (9 is not divisible by 5)", exceptionMsg);
    }
}