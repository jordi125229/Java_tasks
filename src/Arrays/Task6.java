package Arrays;

import java.util.Scanner;

class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task6 test = new Task6();

        System.out.println("Provide array's length");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];

        test.arrayInsert(array, sc);
        test.arrayPriner(array);
        test.findTheBiggest(array);

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

    void findTheBiggest(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];  //tu uzylem chata bo zamulilem, i nadpisywalem array[i] = max i zwieche zlapalem z tym bo nie wiedzialem co jest zle
            }
        }
        System.out.println("Arrays's max number is : " + max);
    }
}
