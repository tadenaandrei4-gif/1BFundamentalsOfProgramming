import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderAssignment2 {
    public static void main(String[] args) throws IOException {
        BufferedReader ilagaymo = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Hourly pay rate: ");
        double payrate = Double.parseDouble(ilagaymo.readLine());

        System.out.print("Enter Hours of Work: ");
        double Hourswork = Double.parseDouble(ilagaymo.readLine());

        double bayad = payrate * Hourswork;

        double tax;
        if(bayad <= 2000){
            tax = 0.10;
        }else if (bayad <= 4000){
            tax = 0.12;
        }else if (bayad <= 10000){
            tax = 0.15;
        }else{
            tax = 0.20;
        }

        double resulta = bayad * tax;
        double netpay = bayad - resulta;

        System.out.println("ANG IYONG PAYROLL");
        System.out.println("Gross Pay: Php " + bayad);
        System.out.println("Withholding Tax (" + (tax * 100) + "%): Php " + resulta);
        System.out.println("Net Pay: Php " + netpay);
    }
    }


