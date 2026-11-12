// I-import ang klaseng Arrays upang magamit ang paraan ng malalim na pag-print ng dalawang-dimensyonal na array
import java.util.Arrays;

public class Movieseat {
    public static void main(String[] args) {
        // Deklarahin at simulan ang dalawang-dimensyonal na array ng mga titik na may dalawang hanay at tatlong hanay ng upuan
        String[][] Upuan = {
                {"Alice", "Bob", "Charlie"}, // Hanay 1: Unang row ng mga upuan
                {"David", "Emma", "Frank"}   // Hanay 2: Pangalawang row ng mga upuan
        };

        // Kunin at ipakita ang pangalan ng tao na nakaupo sa pangalawang hanay at pangatlong kolum, na si Frank
        System.out.println("Naka-upo sa 2nd row, 3rd column: " + Upuan[1][2]);

        // Palitan ang pangalang Bob ng salitang bakante o walang tao
        Upuan[0][1] = "Vacant Seat";

        // Gamitin ang paraan ng pag-print ng buong ayos ng mga upuan sa isang linya lamang
        System.out.println("Buong Seating Arrangement: " + Arrays.deepToString(Upuan));
    }
}

