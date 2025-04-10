package lab21;
public class TestAccount {
    public static void main(String[] args) {
        // Create an Account object with specified parameters
        Account account = new Account(1122, 20000, 4.5);

        // Withdraw $2,500
        account.withdraw(2500);

        // Deposit $3,000
        account.deposit(3000);

        // Print balance, monthly interest, and date created
        System.out.println("Account ID: " + account.getId());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
    }
}
