package Arrays;

class Task2 {
    public static void main(String[] args) {
        String[] names = new String[]{"Kuba", "Bartek", "Rafał"};
        namesPrinter(names);
    }

    static void namesPrinter (String[] tab){
        for (String s : tab) {
            System.out.println("Cześć, " + s);
        }
    }
}
