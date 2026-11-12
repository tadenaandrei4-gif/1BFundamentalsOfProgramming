import java.util.Arrays;

public class TempEveryday {
    public static void main(String[] args) {
        // I-deklara ang double array na 'temperatura' na may eksaktong 5 na elemento
        double[] temperatures = new double[5];

        // Maglagay ng mga tiyak na halaga ng temperatura sa bawat posisyon o indeks ng array
        temperatures[0] = 32.5; // Unang araw
        temperatures[1] = 34.0; // Pangalawang araw
        temperatures[2] = 31.8; // Pangatlong araw
        temperatures[3] = 33.2; // Pang-apat na araw
        temperatures[4] = 35.1; // Panglimang araw

        // Gamitin ang paulit-ulit na pahayag at ang sukat ng array upang ipakita ang bawat temperatura
        System.out.println("Mga temperatura sa loob ng limang araw:");
        for (int i = 0; i < temperatures.length; i++) {
            // Ipakita ang temperatura para sa kasalukuyang araw batay sa indeks
            System.out.println("Araw " + (i + 1) + ": " + temperatures[i]);
        }

        // Baguhin ang halaga ng temperatura para sa pangatlong araw mula sa lumang numero patungo sa bago
        temperatures[2] = 32.0;

        // Ipakita ang binagong temperatura para sa pangatlong araw
        System.out.println("Na-update na temperatura para sa ikatlong araw: " + temperatures[2]);
    }
}