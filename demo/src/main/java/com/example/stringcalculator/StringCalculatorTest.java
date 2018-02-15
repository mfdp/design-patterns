package com.example.stringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {

    @Test
    void addNumbersMethod() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.addNumbers("");
        assertEquals(result, 0);
    }

    @Test
    void addNumbersNotEmptyInput() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.addNumbers("1");
        assertEquals(result, 1);
    }

    @Test
    void addNumbersNotEmptyTwoNumbersInput() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.addNumbers("1,2");
        assertEquals(result, 3);
    }

    @Test
    void addNumbersNotEmptyMoreNumbers() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.addNumbers("1,2,3,4,5,6");
        assertEquals(result, 21);
    }

    @Test
    void addNumbersWithNewLines() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.addNumbers("1\n2,3");
        assertEquals(result, 6);
    }

    @Test
    void addNumbersWrongInput() {
        StringCalculator stringCalculator = new StringCalculator();
        assertThrows(IllegalStateException.class, () -> stringCalculator.addNumbers("1,\n"));
    }
}
