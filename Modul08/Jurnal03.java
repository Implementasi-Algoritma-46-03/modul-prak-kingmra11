import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner masukan = new Scanner(System.in);

        int angka = masukan.nextInt();
        int angkaAsli = angka;
        int total = 0;

        while (angka != 0) {
            int digit = angka % 10;
            
            int faktorial = 1;
            int c = 1;
            while (c <= digit) {
                faktorial *= c;
                c++;
            }

            total += faktorial;
            angka /= 10;
        }

        if(total == angkaAsli){
            System.out.println("YA");
        } else {
            System.out.println("BUKAN");
        }
    }
}