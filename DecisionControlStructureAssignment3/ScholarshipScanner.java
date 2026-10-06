import java.util.Scanner;

public class ScholarshipScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Parents monthly salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter NSAT score: ");
        double nsat = scanner.nextDouble();

        System.out.print("Enter Entrance examination score: ");
        double entrance = scanner.nextDouble();

        // Evaluation Logic
        if (salary > 10000 || nsat < 90 || entrance < 85) {
            System.out.println("REJECTED");
        } else if (salary <= 3500 && ((nsat + entrance) / 2.0) >= 91) {
            System.out.println("ACCEPTED");
        } else {
            System.out.println("FOR FURTHER STUDY");
        }

        scanner.close();
    }
}