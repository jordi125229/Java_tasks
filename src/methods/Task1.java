package methods;

class Task1 {
    public static void main(String[] args) {
        Task1 tester = new Task1();

        tester.powitaj("Kuba");
        tester.powitaj("Olek");
        tester.powitaj("Marek");
    }

    public void powitaj(String word){
        System.out.println("Witaj " + word);
    }
}
