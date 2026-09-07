import java.util.Scanner;

class ATM {
    int pin = 1234;
    double balance = 5000;

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit successful");
    }

    void displayBalance() {
        System.out.println("Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int attempts = 0;
        boolean login = false;

        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == 1234) {
                login = true;
                System.out.println("Login successful");
                break;
            } else {
                attempts++;
                System.out.println("Wrong PIN");
            }
        }

        if (!login) {
            System.out.println("Maximum attempts reached. Account blocked.");
            return;
        }

        ATM atm = new ATM();

        while (true) {
            System.out.println("\n1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to withdraw: ");
                double amount = sc.nextDouble();
                atm.withdraw(amount);
            } 
            else if (choice == 2) {
                System.out.print("Enter amount to deposit: ");
                double amount = sc.nextDouble();
                atm.deposit(amount);
            } 
            else if (choice == 3) {
                atm.displayBalance();
            } 
            else if (choice == 4) {
                System.out.println("Thank you!");
                break;
            } 
            else {
                System.out.println("Invalid choice");
            }
        }
    }
}