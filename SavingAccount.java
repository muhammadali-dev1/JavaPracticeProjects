package lab21;

public class SavingAccount extends Account {

    // Default constructor
    public SavingAccount() {
        super();
    }

    // Parameterized constructor
    public SavingAccount(int id, double balance) {
        super(id, balance, 0); // Default interest rate for saving accounts
    }

    // Overriding withdraw method to disallow overdraft
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient funds. Cannot overdraw on a saving account.");
        }
    }

    // Properly overridden toString() method
    @Override
    public String toString() {
        return "SavingAccount{id=" + getId() + ", balance=" + getBalance() + "}";
    }
}
