package Arrays;

import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task9 test = new Task9();

        System.out.println("Provide array's length");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];

        test.arrayInsert(array, sc);
        test.arrayPriner(array);
        test.findNumber(array);
    }

    void arrayInsert(int[] array, Scanner sc) {
        System.out.println("Provide array's elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }
    void arrayPriner(int[] array) {
        System.out.println("Read array's elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    void findNumber(int[] array){
        System.out.println("Provide number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int xQuantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]){
                xQuantity++;
            }
        }
        System.out.println("Provided number " + x + " occurs in array " + xQuantity + " times");
    }
}
