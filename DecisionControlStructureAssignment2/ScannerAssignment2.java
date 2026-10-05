import java.util.Scanner;

public class ScannerAssignment2 {
    public static void main(String[] args){
        Scanner ilagaymo = new Scanner(System.in);

        System.out.print("Enter Hourly Pay Rate: ");
        double hrrate = ilagaymo.nextDouble();

        System.out.print("Enter Hours of Work: ");
        double hrwork = ilagaymo.nextDouble();

        double bayad = hrrate * hrwork;

        double taks;
        if(bayad <= 2000){
            taks = 0.10;
        }else if (bayad <= 4000){
            taks = 0.12;
        }else if (bayad <= 10000){
            taks = 0.15;
        }else{
            taks = 0.20;
        }

        double resolt = bayad * taks;
        double netpie = bayad - resolt;

        System.out.println("ANG IYONG PAYROLL");
        System.out.println("Gross Pay: Php " + bayad);
        System.out.println("Withholding Tax (" + (taks * 100) + "%): Php " + resolt);
        System.out.println("Net Pay: Php " + netpie);

        ilagaymo.close();
    }
}
