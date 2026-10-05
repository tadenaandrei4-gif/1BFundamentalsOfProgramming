import javax.swing.JOptionPane;

public class JOptionAssignment2 {
    public static void main(String[] args){
        String kabelmodayta = JOptionPane.showInputDialog(null,"Enter Hourly Pay Rate:");
        String awanen = JOptionPane.showInputDialog(null, "Enter Hours of Work:");

        if(kabelmodayta != null && awanen != null){
            double orayt = Double.parseDouble(kabelmodayta);
            double sixseven = Double.parseDouble(awanen);

            double bayad = orayt * sixseven;

            double tax;
            if(bayad <= 2000){
                tax = 0.10;
            } else if (bayad <= 4000){
                tax = 0.12;
            } else if(bayad <= 10000){
                tax = 0.15;
            } else {
                tax = 0.20;
            }

            double withHoldingtax = bayad * tax;
            double netpay = bayad - withHoldingtax;

            String owverowl = "PAYROLL SUMMARY:\n\n"
                    + "Gross Pay: Php " + bayad + "\n"
                    + "Withholding Tax (" + (tax * 100) + "%): Php " + withHoldingtax + "\n"
                    + "Net Pay: Php " + netpay;

            JOptionPane.showMessageDialog(null, owverowl);

        }

    }
}
