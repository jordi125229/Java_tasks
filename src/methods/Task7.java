package methods;

class Task7 {
    public static void main(String[] args) {
        int x = 5;
        changeX(x);
        System.out.println(x);
    }

    static void changeX(int x) {
        x = 7;
        System.out.println(x);
    }
}
