package com.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class AdditionalAnnotationsTest {

    @Test
    @DisplayName("Powinien poprawnie dzielić dwie liczby całkowite")
    void divisionTest() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.divide(10, 2));
    }

    @Test
    @Disabled("TODO: Naprawić po refaktoringu modułu płatności")
    void brokenTest() {
        // Ten test jest tymczasowo wyłączony
        fail("Ten test nie powinien się wykonać");
    }

    @Nested
    @DisplayName("Testy dla dzielenia")
    class DivisionTests {

        @Test
        @DisplayName("Dzielenie dwóch dodatnich liczb")
        void shouldDividePositiveNumbers() {
            Calculator calc = new Calculator();
            assertEquals(3, calc.divide(9, 3));
        }

        @Test
        @DisplayName("Dzielenie przez jeden zwraca tę samą liczbę")
        void shouldReturnSameWhenDividingByOne() {
            Calculator calc = new Calculator();
            assertEquals(7, calc.divide(7, 1));
        }
    }
}