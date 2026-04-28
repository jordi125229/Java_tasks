package com.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testy kalkulatora")
class CalculatorCompleteTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Nested
    @DisplayName("Testy dodawania")
    class AdditionTests {

        @Test
        @DisplayName("Dodawanie dwóch liczb dodatnich")
        void shouldAddTwoPositiveNumbers() {
            assertEquals(5, calculator.add(2, 3));
        }

        @Test
        @DisplayName("Dodawanie z zerem")
        void shouldReturnSameNumberWhenAddingZero() {
            assertEquals(7, calculator.add(7, 0));
            assertEquals(7, calculator.add(0, 7));
        }

        @Test
        @DisplayName("Dodawanie liczb ujemnych")
        void shouldAddNegativeNumbers() {
            assertEquals(-5, calculator.add(-2, -3));
        }
    }

    @Nested
    @DisplayName("Testy dzielenia")
    class DivisionTests {

        @Test
        @DisplayName("Dzielenie dwóch liczb")
        void shouldDivideTwoNumbers() {
            assertEquals(5, calculator.divide(10, 2));
        }

        @Test
        @DisplayName("Dzielenie przez zero rzuca wyjątek")
        void shouldThrowExceptionWhenDividingByZero() {
            assertThrows(IllegalArgumentException.class,
                    () -> calculator.divide(10, 0));
        }
    }
}