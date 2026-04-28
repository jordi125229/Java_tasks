package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Substraction test")
public class SubstractionTest {

    private Calculator calculator;

    @BeforeEach
    void setCalculator() {
        calculator = new Calculator();
    }

    @Test
    void shouldSubtractTwoNumbers() {
        // given
        int firstNumber = 5;
        int secondNumber = 3;

        // when
        int result = calculator.subtract(firstNumber, secondNumber);

        // then
        assertEquals(2, result);
    }

    @Test
    void shouldSubtractTwoNumbersWhenResultIsNegative() {
        // given
        int firstNumber = 3;
        int secondNumber = 5;

        // when
        calculator.subtract(firstNumber, secondNumber);

        //then
        assertEquals(-2, calculator.subtract(firstNumber,secondNumber));
    }

    @Test
    void shouldSubtractTwoNumbersWhenOneIsZero() {
        // given
        int firstNumber = 5;
        int secondNumber = 0;

        // when
        calculator.subtract(firstNumber, secondNumber);

        //then
        assertEquals(5, calculator.subtract(firstNumber,secondNumber));
    }

    @Test
    void shouldSubtractTwoNumbersWhenFirstOneIsZero() {
        // given
        int firstNumber = 0;
        int secondNumber = 5;

        // when
        calculator.subtract(firstNumber, secondNumber);

        //then
        assertEquals(-5, calculator.subtract(firstNumber,secondNumber));
    }

    @Test
    void shouldSubtractTwoNumbersWhenTwoNumbersAreNegative() {
        // given
        int firstNumber = -3;
        int secondNumber = -2;

        // when
        calculator.subtract(firstNumber, secondNumber);

        //then
        assertEquals(-1, calculator.subtract(firstNumber,secondNumber));
    }
}
