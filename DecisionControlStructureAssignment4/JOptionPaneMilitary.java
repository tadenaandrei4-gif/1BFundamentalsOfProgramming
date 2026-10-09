import javax.swing.JOptionPane;

public class JOptionPaneMilitary {
    public static void main(String[] args) {
        String Height = JOptionPane.showInputDialog("Enter your Height");
        String Age = JOptionPane.showInputDialog("Enter your Age");
        String Citizen = JOptionPane.showInputDialog("Enter Citizenship code");
        String Recommendee = JOptionPane.showInputDialog( "Enter if your Recomendee or not");

        if (Height != null && Age != null && Citizen != null && Recommendee != null) {
            double height = Double.parseDouble(Height);
            int age = Integer.parseInt(Age);
            char citizenship = Citizen.toUpperCase().charAt(0);
            char recommendee = Recommendee.toUpperCase().charAt(0);

            if (recommendee == 'R') {
                JOptionPane.showMessageDialog(null, "ACCEPTED","RESULT" , JOptionPane.INFORMATION_MESSAGE);
            } else if (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') {
                JOptionPane.showMessageDialog(null, "ACCEPTED","RESULT" , JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "REJECTED", "RESULT" , JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}

