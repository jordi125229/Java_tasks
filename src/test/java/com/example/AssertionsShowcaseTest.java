package com.example;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;


public class AssertionsShowcaseTest {

    @Test
    void equalityAssertions() {
        // Równość wartości
        assertEquals(5, 2 + 3);
        assertEquals("ABC", "abc".toUpperCase());
        assertEquals(3.14159, Math.PI, 0.001); // z tolerancją dla double

        // Nierówność
        assertNotEquals(4, 2 + 3);
    }

    @Test
    void booleanAssertions() {
        assertTrue(5 > 3);
        assertTrue("Hello".startsWith("H"));

        assertFalse(2 > 5);
        assertFalse("Hello".isEmpty());
    }

    @Test
    void nullAssertions() {
        String nullString = null;
        String notNullString = "Hello";

        assertNull(nullString);
        assertNotNull(notNullString);
    }

    @Test
    void referenceAssertions() {
        String s1 = "test";
        String s2 = s1;
        String s3 = new String("test");

        assertSame(s1, s2);      // Ten sam obiekt (referencja)
        assertNotSame(s1, s3);   // Różne obiekty (choć równe wartości)
    }

    @Test
    void arrayAssertions() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};

        assertArrayEquals(expected, actual);
    }

    @Test
    void timeoutAssertion() {
        // Test nie powinien trwać dłużej niż 100ms
        assertTimeout(Duration.ofMillis(100), () -> {
            // Symulacja szybkiej operacji
            Thread.sleep(50);
        });
    }

    @Test
    void groupedAssertions() {
        Calculator calc = new Calculator();

        // Wszystkie asercje są sprawdzane, nawet jeśli pierwsza padnie
        assertAll("operacje matematyczne",
                () -> assertEquals(5, calc.add(2, 3)),
                () -> assertEquals(6, calc.multiply(2, 3)),
                () -> assertEquals(2, calc.subtract(5, 3))
        );
    }

    @Test
    void assertionsWithMessages() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 2);

        // Prosty komunikat
        assertEquals(4, result, "2 + 2 powinno równać się 4");

        // Lazy message (obliczany tylko gdy asercja padnie)
        // Przydatne gdy tworzenie komunikatu jest kosztowne
        assertEquals(4, result, () -> "Otrzymano wynik: " + result + ", oczekiwano: 4");
    }
}
