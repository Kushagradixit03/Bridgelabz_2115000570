public class BankAccount {
    static String bankName="abc";
    
    static int totalAccounts = 0;

    final int accountNumber;
    
    String accountHolderName;
    double balance;

    public BankAccount(String accountHolderName, int accountNumber, double initialBalance) {
		this.accountHolderName = accountHolderName;  
        this.accountNumber = accountNumber;        
        this.balance = initialBalance;
        totalAccounts++;  
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts in " + bankName + ": " + totalAccounts);
    }

    public void displayAccountDetails() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("abc","Kushagra", 1001, 1500.50);
        BankAccount account2 = new BankAccount("bac","Aman", 1002, 2500.75);

        BankAccount.getTotalAccounts();

        if (account1 instanceof BankAccount) {
            account1.displayAccountDetails();
        }

        if (account2 instanceof BankAccount) {
            account2.displayAccountDetails();
        }

    }
}
