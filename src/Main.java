import accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount("123456789", 1500.75, 1234);

        // Realizar algunas operaciones
        myAccount.deposit(200);
        if (myAccount.authenticate(1234)) {
            System.out.println("Acceso Concedido");
        }

        myAccount.withdraw(100);
        myAccount.printStatus();
    }
}
