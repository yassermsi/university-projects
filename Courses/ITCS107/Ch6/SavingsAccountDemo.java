class SavingsAccount {
    private double balance = 0.0;
    private static double interestRate = 0.0;
    private static int numAccounts = 0;
    public SavingsAccount() {
        balance = 0.0;
        numAccounts++;
    }
    public static void setInterestRate(double rate) {
        interestRate = rate;
    }
    public static double getInterestRate() {
        return interestRate;
    }
    public static void setNumAccounts(int num) {
        numAccounts = num;
    }
    public static int getNumAccounts() {
        return numAccounts;
    }
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid deposit amount");
            System.exit(0);
        }
        else
            balance += amount;
    }
    public double withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return 0.0;
        }
        else {
            balance -= amount;
            return amount;
        }
    }
    public void addInterest() {
        double interest = balance * getInterestRate();
        balance += interest;
    }
    public double getBalance() {
        return balance;
    }
    public static void showBalance(SavingsAccount account) {
        System.out.println(account.getBalance());
    }
}

public class SavingsAccountDemo {
    public static void main(String[] args) {
        SavingsAccount.setInterestRate(0.01);
        SavingsAccount mySavings = new SavingsAccount();
        SavingsAccount yourSavings = new SavingsAccount();
        System.out.println("I deposited $10.75.");
        mySavings.deposit(10.75);
        System.out.println("You deposited $75.");
        yourSavings.deposit(75.0);
        System.out.println("You deposited $55.");
        yourSavings.deposit(55.0);
        double cash = yourSavings.withdraw(15.75);
        System.out.println("You withdrew $" + cash + ".");
        if (yourSavings.getBalance() > 100.0) {
            System.out.println("You recieived interest.");
            yourSavings.addInterest();
        }
        System.out.println("Your savings is $" + yourSavings.getBalance() + ".");
        System.out.print("My savings is $");
        SavingsAccount.showBalance(mySavings);
        System.out.println();
        int count = SavingsAccount.getNumAccounts();
        System.out.println("We opened " + count + " savings accounts today.");
    }
}