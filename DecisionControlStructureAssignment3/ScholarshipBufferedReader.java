import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ScholarshipBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Parents monthly salary: ");
        double salary = Double.parseDouble(reader.readLine());

        System.out.print("Enter NSAT score: ");
        double nsat = Double.parseDouble(reader.readLine());

        System.out.print("Enter Entrance examination score: ");
        double entrance = Double.parseDouble(reader.readLine());

        // Evaluation Logic
        if (salary > 10000 || nsat < 90 || entrance < 85) {
            System.out.println("REJECTED");
        } else if (salary <= 3500 && ((nsat + entrance) / 2.0) >= 91) {
            System.out.println("ACCEPTED");
        } else {
            System.out.println("FOR FURTHER STUDY");
        }
    }
}