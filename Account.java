package lab21;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // Default constructor
    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Parameterized constructor
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter and Setter for annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Getter for dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    // Method to calculate the monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    // Method to calculate the monthly interest
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // Method to withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Properly overridden toString() method
    @Override
    public String toString() {
        return "Account{id=" + id + ", balance=" + balance + ", annualInterestRate=" +
               annualInterestRate + ", dateCreated=" + dateCreated + "}";
    }
}
