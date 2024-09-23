package accounts;

public class CheckingAccount extends Account {
    public CheckingAccount(String accountNumber, double initialBalance, int pin) {
        super(accountNumber, initialBalance, pin);
    }

    @Override
    public void printStatus() {
        super.printStatus();
        System.out.println("Este es un cuenta corriente.");
    }
}
