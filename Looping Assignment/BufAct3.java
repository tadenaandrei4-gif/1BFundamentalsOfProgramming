import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufAct3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double balance = 20000.00;

        System.out.println("Initial Balance: P" + balance);
        System.out.println("Enter numbers (Positive = Deposit, Negative = Withdrawal, 0 = Exit):");

        while (true) {
            System.out.print("Enter amount: ");
            double amount = Double.parseDouble(reader.readLine());

            if (amount == 0) {
                System.out.println("Final Balance: " + balance);
                break;
            } else if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: P" + amount);
                System.out.println("Outstanding Balance: P" + balance);
            } else {
                double withdrawal = Math.abs(amount);
                if (withdrawal > balance) {
                    System.out.println("INSUFFICIENT FUNDS!");
                    System.out.println("Outstanding Balance: P" + balance);
                } else {
                    balance -= withdrawal;
                    System.out.println("Withdrew: P" + withdrawal);
                    System.out.println("Outstanding Balance: P" + balance);
                }
            }
            System.out.println("\n");
        }
    }
}