abstract class Account {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }
    public abstract void withdraw(double amount);
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
class SavingAccount extends Account {
    private double minimumBalance = 500;
    public SavingAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdraw amount from Saving is " + amount);
        } else {
            System.out.println("Cannot withdraw; minimum balance must be maintained");
        }
    }
}
class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount from Current is " + amount);
        } else {
            System.out.println("Cannot withdraw amount");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        SavingAccount Sa = new SavingAccount("PK10001", "Haseeb", 1000);
        CurrentAccount Ca = new CurrentAccount("PK10009", "Ahsan", 2000);

        System.out.println("Saving Account Transactions are:");
        Sa.display();
        Sa.deposit(200);
        Sa.withdraw(500);
        Sa.withdraw(900);
        System.out.println("\nCurrent Account Transactions are:");
        Ca.display();
        Ca.deposit(100);
        Ca.withdraw(1500);
        Ca.display();
    }
}
