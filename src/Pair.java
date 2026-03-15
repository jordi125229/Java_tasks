import java.util.Objects;

public class Pair<K1, K2> {
    private K1 first;
    private K2 second;

    public Pair(K1 first, K2 second) {
        if (first == null || second == null) {
            throw new NullPointerException("Keys can't be null");
        }
        this.first = first;
        this.second = second;
    }

    public K1 getFirst() {
        return first;
    }

    public K2 getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return "<" + first + ", " + second + ">";
    }
}
