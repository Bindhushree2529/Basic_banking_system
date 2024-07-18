package bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("1. Create account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. View all accounts");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter account holder name: ");
                    String accountHolderName = scanner.nextLine();
                    bank.createAccount(accountNumber, accountHolderName);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(accountNumber, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(accountNumber, withdrawAmount);
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    bank.checkBalance(accountNumber);
                    break;
                case 5:
                    bank.viewAccounts();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
