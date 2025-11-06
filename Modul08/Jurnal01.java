import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();


        while (b != 0) { 
            a /= 2;
            b -= 10;
        }

        System.out.printf("%.3f\n",a);

        scan.close();
    }
}

