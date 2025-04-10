package lab21;

public class TestAccounts {
    public static void main(String[] args) {
        // Create an Account object
        Account account = new Account(101, 5000, 3.5);

        // Create a CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount(102, 2000, 500);

        // Create a SavingAccount object
        SavingAccount savingAccount = new SavingAccount(103, 3000);

        // Perform some operations
        account.withdraw(1000);
        checkingAccount.withdraw(2400); // Within overdraft limit
        savingAccount.withdraw(3500);  // Should fail due to insufficient funds

        // Display the details
        System.out.println(account.toString());
        System.out.println(checkingAccount.toString());
        System.out.println(savingAccount.toString());
    }
}
