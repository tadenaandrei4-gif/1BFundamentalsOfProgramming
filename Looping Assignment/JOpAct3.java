import javax.swing.JOptionPane;

public class JOpAct3 {
    public static void main(String[] args) {
        double balance = 20000.00;

        while (true) {
            String input = JOptionPane.showInputDialog(null,
                    "Current Balance: P" + balance +
                            "\nEnter amount (Positive = Deposit, Negative = Withdrawal, 0 = Exit):");

            if (input == null) break;
            double amount = Double.parseDouble(input);

            if (amount == 0) {
                JOptionPane.showMessageDialog(null, "Final Balance: " + balance);
                break;
            } else if (amount > 0) {
                balance += amount;
                JOptionPane.showMessageDialog(null, "Deposited: P" + amount + "\nOutstanding Balance: P" + balance);
            } else {
                double withdrawal = Math.abs(amount);
                if (withdrawal > balance) {
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!\nOutstanding Balance: P" + balance, "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    balance -= withdrawal;
                    JOptionPane.showMessageDialog(null, "Withdrew: P" + withdrawal + "\nOutstanding Balance: P" + balance);
                }
            }
        }
    }
}