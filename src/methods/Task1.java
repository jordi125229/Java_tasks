package methods;

class Task1 {
    public static void main(String[] args) {
        Task1 tester = new Task1();

        tester.welcome("Kuba");
        tester.welcome("Olek");
        tester.welcome("Marek");
    }

    public void welcome(String word){
        System.out.println("Hello " + word);
    }
}
