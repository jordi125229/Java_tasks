
class Task0Test {
    public static void main(String[] args) {
        //Specyfikator public- mozemy odwolywac sie do pol bezposrednio
        Task0Public test1 = new Task0Public();
        test1.name = "new test of public";
        test1.number = 1;

        //Specyfikator private - potrzebujemy getterow i setterow zeby odwolywac sie do pol
        Task0Private test2 = new Task0Private();
        test2.setName("test of private specyficator");
        test2.setNumber(2); //zeby ustawic pola
        System.out.println(test2.getName() + "; " + test2.getNumber()); //get zeby je pobrac


    }
}
