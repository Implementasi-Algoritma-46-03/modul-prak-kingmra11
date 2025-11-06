import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner scan = new Scanner(System.in);

        double a = 0;
        double b;
        double c = -1;

        do { 
            b = scan.nextDouble();
            a += b;
            c++;
        } while (b != 0);

        a /= c;

        System.out.printf("%.2f\n", a);

        scan.close();
    }
}
