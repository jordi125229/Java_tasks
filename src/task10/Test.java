package task10;

import static task10.Method.findValue;

public class Test {
    public static void main(String[] args) {
        String test1 = findValue("A"); //tylko jedna metoda sie wykonuje, znajduje, koniec
        String test2 = findValue("B"); // wykonuje sie pierwsza, nie znajduje, wiec druga, znajduje, koniec
        String test3 = findValue("C"); // adekwatnie jak wyzej ale dopiero wykonuj sie defaultowa metoda

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
    }
}
