package task2;

final class NumberParser {
    static int parsePositiveInt(String word) {
        int value;
        try {
            value = Integer.parseInt(word);
        } catch (NumberFormatException e) {
            throw new InvalidNumberException("Invalid number: '<" + word + ">", e);
        }
        if (value <= 0) {
            throw new IllegalArgumentException("non-positive: " + value);
        }
        return value;
    }
}
