package task11;

public class Test {
    public static void main(String[] args) {
        StringFormatter toUpperCase = s -> s.toUpperCase();

        StringFormatter prefix = s -> {
            return ">>> " + s;
        };

        StringFormatter reversal = s -> {
            return new StringBuilder(s)
                    .reverse()
                    .toString();
        };

        String test1 = applyFormat("java", toUpperCase);
        String test2 = applyFormat("java", prefix);
        String test3 = applyFormat("java", reversal);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
    }

    static String applyFormat(String text, StringFormatter formatter) {
        return formatter.format(text);
    }
}

