import java.util.Scanner;


public class ATMApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount("Sumanth", 1000.0);

        while (true) {
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("please enter the amount to deposit ");
                    int amt = scanner.nextInt();
                    account.deposit(amt);
                    break;
                }
                case 2: {
                    System.out.println("please enter the amount to withdraw ");
                    int amt = scanner.nextInt();
                    account.withdraw(amt);
                    break;
                }
                case 3: {

                    account.showBalance();
                    break;
                }
                case 4: System.exit(0);
                default: System.out.println("Invalid input");
            }
        }
    }
}
