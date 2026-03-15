package task3;

final class BankAccount {
    private int balance;

    public BankAccount(int initial) {
        this.balance = initial;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Balance is: " + balance + " and amount is: " + amount);
        }
        balance -= amount;
        System.out.println("Balance after withdraw: " + balance);
    }
}
