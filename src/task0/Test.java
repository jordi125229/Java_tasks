package task0;

class Test {
    public static void main(String[] args) {
        Task0Protected test = new Task0Protected();
        test.name = "test1";
        test.number = 1;
        //odwolujemy sie tylko w tym samym pakiecie

        System.out.println(test.name + "; " + test.number);
    }
}
