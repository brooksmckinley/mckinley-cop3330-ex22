/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testLargestReport() {
        String expected = "The largest number is 51.";
        String actual = App.getLargestReport(1, 51, 2);
        Assertions.assertEquals(expected, actual);
    }
}