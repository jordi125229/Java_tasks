package task6;

import java.util.Objects;

public final class Triple<FIRST, SECOND, THIRD> {
    private final FIRST first;
    private final SECOND second;
    private final THIRD third;

    public FIRST first() {
        return first;
    }

    public SECOND second() {
        return second;
    }

    public THIRD third() {
        return third;
    }

    public Triple(FIRST first, SECOND second, THIRD third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static <FIRST, SECOND, THIRD> Triple<FIRST, SECOND, THIRD> of(FIRST first, SECOND second, THIRD third) {
        return new Triple<>(first, second, third);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triple<?, ?, ?> triple = (Triple<?, ?, ?>) o;
        return Objects.equals(first, triple.first) && Objects.equals(second, triple.second) && Objects.equals(third, triple.third);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third);
    }

    @Override
    public String toString() {
        return "Triple: " + first + "; " + second + "; " + third;
    }
}
