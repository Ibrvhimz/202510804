import java.util.Scanner;

public class ATMSimulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int CORRECT_PIN = 1234;
        final int MAX_ATTEMPTS = 3;
        int attempts = 0;
        boolean isAuthenticated = false;

        double balance = 1000.0; 
        String[] transactions = new String[100]; 
        int transactionCount = 0; 

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == CORRECT_PIN) {
                isAuthenticated = true;
                System.out.println("Login successful!\n");
                break;
            } else {
                attempts++;
                int remaining = MAX_ATTEMPTS - attempts;
                if (remaining > 0) {
                    System.out.println("Incorrect PIN. Attempts remaining: " + remaining);
                }
            }
        }

        if (!isAuthenticated) {
            System.out.println("Maximum attempts reached. Account locked.");
            scanner.close();
            return; 
        }

        int choice = 0;
        while (choice != 5) {
            System.out.println("=== ATM Main Menu ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + balance + "\n");
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        if (transactionCount < transactions.length) {
                            transactions[transactionCount] = "Deposited: $" + depositAmount;
                            transactionCount++;
                        }
                        System.out.println("Deposit successful! New Balance: $" + balance + "\n");
                    } else {
                        System.out.println("Invalid amount.\n");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        if (transactionCount < transactions.length) {
                            transactions[transactionCount] = "Withdrew: $" + withdrawAmount;
                            transactionCount++;
                        }
                        System.out.println("Withdrawal successful! New Balance: $" + balance + "\n");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Error: Insufficient balance!\n");
                    } else {
                        System.out.println("Invalid amount.\n");
                    }
                    break;

                case 4:
                    System.out.println("--- Transaction History ---");
                    if (transactionCount == 0) {
                        System.out.println("No transactions yet.");
                    } else {
                        for (int i = 0; i < transactionCount; i++) {
                            System.out.println((i + 1) + ". " + transactions[i]);
                        }
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        }

        scanner.close();
    }
}
