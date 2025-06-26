public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String name, double initialBalance) {
        this.accountHolder = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount ;
        System.out.println("Your have deposited " + amount + " to your account the current balance is "+ this.balance);
    }
    public void withdraw(double amount) {
        this.balance -= amount;
        System.out.println("Your have withdrawn " + amount + " from your account the current balance is "+ this.balance);

    }
    public void showBalance() {
        System.out.println("Your account Balance is"+ this.balance);
    }
}
