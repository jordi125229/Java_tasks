package task10;

import java.util.function.Supplier;

public class CodeGenerator {
//    Supplier<String> codeSupplier = () ->;
}

/*Zadanie 10 – Generator kodów (`Supplier`)

1. Zdefiniuj `Supplier<String> codeSupplier`, który generuje 6-znakowy losowy kod z liter A–Z i cyfr 0–9.
        2. W `main`:

        * utwórz tablicę `String[] codes = new String[10];`
        * wypełnij ją 10 wygenerowanymi kodami (pętla `for` + `supplier.get()`),
        * wypisz wszystkie kody.

> Bez `Stream.generate`, tylko `Supplier` + zwykła pętla.*/