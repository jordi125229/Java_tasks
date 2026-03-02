package task2;

import java.util.List;
import java.util.Optional;

public class Method {
    static Optional<String> findCityByCode(String code) {
        if (code == null) {
            return Optional.empty();
        }
        switch (code.toUpperCase()) {
            case "WA":
                return Optional.of("Warszawa");
            case "KR":
                return Optional.of("Kraków");
            case "GD":
                return Optional.of("Gdańsk");
            default:
                return Optional.empty();
        }
    }
}


/*Metoda ma obsługiwać kody: `"WA"` → Warszawa, `"KR"` → Kraków, `"GD"` → Gdańsk. Dla nieznanych kodów — pusty Optional.

W `main` wywołaj tę metodę z kodami `"WA"`, `"PO"` i `"GD"`. Dla każdego wyniku wypisz, czy miasto zostało znalezione, a jeśli tak — jakie.

> Nie używaj `get()` bez sprawdzenia. Zastanów się, dlaczego `get()` na pustym Optional to zły pomysł.*/