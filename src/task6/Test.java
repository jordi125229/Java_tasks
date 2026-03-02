package task6;

import static task6.Method.presenceChecking;
import static task6.Method.presenceChecking2;

public class Test {
    public static void main(String[] args) {
        String[] nicki = {"Janek", null, "Ania", null, "Kuba"};
        presenceChecking(nicki);
        System.out.println("Second test: ");
        presenceChecking2(nicki);
    }
}
