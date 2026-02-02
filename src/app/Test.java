package app;

import money.Money;
import resources.Room;

import java.util.HashSet;
import java.util.Set;


class Test {
    public static void main(String[] args) {
        Set<String> eq = new HashSet<>();
        eq.add("projector");
        Room room = new Room("super", Money.of("451"), 12, eq);
        System.out.println(room.describe());
    }
}
