package lab21;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    // Default constructor
    public CheckingAccount() {
        super();
        this.overdraftLimit = 0;
    }

    // Parameterized constructor
    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance, 0); // Default interest rate for checking accounts
        this.overdraftLimit = overdraftLimit;
    }

    // Getter and Setter for overdraftLimit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // Overriding withdraw method to handle overdraft
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    // Properly overridden toString() method
    @Override
    public String toString() {
        return "CheckingAccount{id=" + getId() + ", balance=" + getBalance() +
               ", overdraftLimit=" + overdraftLimit + "}";
    }
}
