package com.demo.service;

import com.demo.entity.UserInputEntity;
import com.demo.exception.InvalidInputException;
import com.demo.validator.CustomSortInputValidator;
import org.junit.Assert;
import org.junit.Test;

public class CustomSortServiceTest {

    CustomSortInputValidator inputValidator = new CustomSortInputValidator();
    CustomSortService sortService = new CustomSortService();

    @Test
    public void customSort_HappyCase() throws InvalidInputException {
        UserInputEntity userInputEntity = new UserInputEntity(3, new int[] {8, 9, 5, 3, 2, 1, 7, 6, 4});
        int[] actual = sortService.customSort(userInputEntity);
        Assert.assertArrayEquals(new int[] {3, 2, 1, 6, 5, 4, 9, 8, 7}, actual);
    }

    @Test
    public void customSort_HappyCase2() throws InvalidInputException {
        UserInputEntity userInputEntity = new UserInputEntity(2, new int[] {6, 7, 4, 8, 1, 3, 2, 5});
        int[] actual = sortService.customSort(userInputEntity);
        Assert.assertArrayEquals(new int[] {2, 1, 4, 3, 6, 5, 8, 7}, actual);
    }

    @Test
    public void customSort_ProbableEdgeCase() throws InvalidInputException {
        UserInputEntity userInputEntity = new UserInputEntity(1, new int[] {1});
        int[] actual = sortService.customSort(userInputEntity);
        Assert.assertArrayEquals(new int[] {1}, actual);
    }
}