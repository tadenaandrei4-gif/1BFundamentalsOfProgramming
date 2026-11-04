import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufAct1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int n, h, l;

        System.out.print("Enter number 1: ");
        n = Integer.parseInt(br.readLine());

        h = n;
        l = n;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            n = Integer.parseInt(br.readLine());

            if (n > h) {
                h = n;
            }

            if (n < l) {
                l = n;
            }
        }

        System.out.println("\nHighest number: " + h);
        System.out.println("Lowest number: " + l);
    }
}