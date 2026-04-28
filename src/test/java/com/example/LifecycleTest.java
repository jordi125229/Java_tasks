package com.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LifecycleTest {

    private Calculator calculator;

    @BeforeAll
    static void setupAll() {
        // Wykonuje się RAZ przed wszystkimi testami
        // Musi być static!
        System.out.println("=== ROZPOCZYNAM TESTY ===");
    }

    @BeforeEach
    void setup() {
        // Wykonuje się PRZED KAŻDYM testem
        // Idealne miejsce na inicjalizację obiektów
        calculator = new Calculator();
        System.out.println("Przygotowuję nowy Calculator");
    }

    @Test
    void test1() {

        System.out.println("Wykonuję test1");
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void test2() {

        System.out.println("Wykonuję test2");
        assertEquals(6, calculator.multiply(2, 3));
    }

    @AfterEach
    void tearDown() {
        // Wykonuje się PO KAŻDYM teście
        // Czyszczenie zasobów
        System.out.println("Sprzątam po teście");
    }

    @AfterAll
    static void tearDownAll() {
        // Wykonuje się RAZ po wszystkich testach
        System.out.println("=== KONIEC TESTÓW ===");
    }
}