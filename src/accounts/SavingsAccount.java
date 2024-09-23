package accounts;

public class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double initialBalance, int pin) {
        super(accountNumber, initialBalance, pin);
    }

    @Override
    public void printStatus() {
        super.printStatus();
        System.out.println("Este es un ahorro.");
    }
}
