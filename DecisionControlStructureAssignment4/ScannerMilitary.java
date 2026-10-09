import java.util.Scanner;

public class ScannerMilitary {
    public static void main(String[] args){
        Scanner gerald = new Scanner(System.in);

        System.out.print("Enter your Height: ");
        double height = gerald.nextDouble();

        System.out.print("Enter your Age: ");
        int age = gerald.nextInt();

        System.out.print("Enter citizenship code (C for citizen, N for non-citizen): ");
        char citizenship = gerald.next().toUpperCase().charAt(0);

        System.out.print("Enter recommendee code (R for recommendee, N for non-recommendee): ");
        char recomendee = gerald.next().toUpperCase().charAt(0);

        if(recomendee == 'R'){
            System.out.println("ACCEPTED");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') {
            System.out.println("ACCEPTED");
        }else{
            System.out.println("REJECTED");
        }
        gerald.close();
    }
}
