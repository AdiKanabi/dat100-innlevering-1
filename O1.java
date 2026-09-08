import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Skriv bruttoinntekt: ");
        int inntekt = in.nextInt();

        double skatt = 0;

        if (inntekt <= 217400) {
            skatt = 0;
        } else if (inntekt <= 306050) {
            skatt = (inntekt - 217400) * 1.7 / 100;
        } else if (inntekt <= 697150) {
            skatt = (306050 - 217400) * 1.7 / 100
                  + (inntekt - 306050) * 4.0 / 100;
        } else if (inntekt <= 942400) {
            skatt = (306050 - 217400) * 1.7 / 100
                  + (697150 - 306050) * 4.0 / 100
                  + (inntekt - 697150) * 13.7 / 100;
        } else if (inntekt <= 1410750) {
            skatt = (306050 - 217400) * 1.7 / 100
                  + (697150 - 306050) * 4.0 / 100
                  + (942400 - 697150) * 13.7 / 100
                  + (inntekt - 942400) * 16.7 / 100;
        } else {
            skatt = (306050 - 217400) * 1.7 / 100
                  + (697150 - 306050) * 4.0 / 100
                  + (942400 - 697150) * 13.7 / 100
                  + (1410750 - 942400) * 16.7 / 100
                  + (inntekt - 1410750) * 17.7 / 100;
        }

        System.out.printf("Trinnskatt: %.2f kr%n", skatt);

        in.close();
    }
}