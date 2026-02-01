package Arrays;

class Task1 {
    //Test
    public static void main(String[] args) {
        int[] tab = new int[]{1, 3, 4, 5, 7};
        Task1 test = new Task1();
        test.arrayPrinter(tab);
    }

    //Metoda
    public void arrayPrinter(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
