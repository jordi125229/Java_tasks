import java.util.Scanner;

class Task13 {
    public static void main(String[] args) {
        Task13 test = new Task13();
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj slowo");
        String word = sc.nextLine();
        test.fromStringToChars(word);
    }
    private void fromStringToChars(String word) {
        char[] chars = new char[word.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = word.charAt(i);
            System.out.println(chars[i]);
        }
    }
}
