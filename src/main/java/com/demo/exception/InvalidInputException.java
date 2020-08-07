package com.demo.exception;

public class InvalidInputException extends Exception {

    private int dividend;
    private int divisor;

    public InvalidInputException(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    @Override
    public String toString() {
        return String.format("Invalid Input (%d is not divisible by %d)", dividend, divisor);
    }
}
