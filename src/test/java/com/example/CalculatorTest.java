package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void shouldAddTwoPositiveNumbers() {
        // given | Arrange
        Calculator calc = new Calculator();
        int number1 = 3;
        int number2 = 5;

        // when | Act
        int result = calc.add(number1, number2);

        // then | Assert
        assertEquals(8, result);
    }

    @Test
    void shouldAddNegativeNumbers() {
        Calculator calc = new Calculator();

        int result = calc.add(-2, -3);

        assertEquals(-5, result);
    }

    @Test
    void shouldAddPositiveAndNegative() {
        Calculator calc = new Calculator();

        int result = calc.add(5, -3);

        assertEquals(2, result);
    }

}