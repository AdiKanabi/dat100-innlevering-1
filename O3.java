import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Skriv inn et heltall n > 0: ");
            int n = in.nextInt();

            if (n <= 0) {
                System.out.println("Feil: n må være større enn 0.");
            } else {
                long fakultet = 1;

                for (int i = 1; i <= n; i++) {
                    fakultet = fakultet * i;
                }

                System.out.println(n + "! = " + fakultet);
            }
        }
    }
}