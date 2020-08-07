package com.demo.validator;

import com.demo.exception.InvalidInputException;

public class CustomSortInputValidator {

    public void validate(int dividend, int divisor) throws InvalidInputException {
        if (dividend <= 0 && divisor <= 0) {
            throw new RuntimeException("Please give non-zero & positive inputs");
        }
        if (dividend % divisor != 0) {
            throw new InvalidInputException(dividend, divisor);
        }
    }
}
