package task3;

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        try {
            bankAccount.withdraw(110);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("The end of the transaction");
        }
    }
}
