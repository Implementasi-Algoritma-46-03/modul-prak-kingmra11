import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int angka = 0;
        for (int i = n; i >= 1;  i--){
            for (int j = i; j >= 1; j--){
                angka = angka % 10;
                System.out.print(angka);
                angka++;
            }
            System.out.println();
        }
           // Kerjakan soalnya di sini
    }
}
