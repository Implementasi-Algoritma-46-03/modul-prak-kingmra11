import java.util.Scanner;

public class Jurnal02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int penghasilanJuta = input.nextInt();

        double pajakPersen;
        int Pajakbulat;
        if (penghasilanJuta > 500) {
            pajakPersen = 0.30;
            Pajakbulat = 30;
        } else if (penghasilanJuta > 250) {
            pajakPersen = 0.25;
            Pajakbulat = 25;
        } else if (penghasilanJuta > 50) {
            pajakPersen = 0.15;
            Pajakbulat = 15;
        } else if (penghasilanJuta > 0) {
            pajakPersen = 0.05;
            Pajakbulat = 5;
        } else {
            pajakPersen = 0;
            Pajakbulat = 0;
            
            

        }

        long penghasilanRupiah = (long) penghasilanJuta * 1000000L;
        long pajakBayar = (long) (penghasilanRupiah * pajakPersen);
        long penghasilanBersih = penghasilanRupiah - pajakBayar;

        System.out.println("Penghasilan Kotor = " + penghasilanRupiah);
        System.out.println("Pajak " + Pajakbulat + "% = Rp. " + pajakBayar);
        System.out.println("Penghasilan Bersih = Rp. " + penghasilanBersih);
    }
}

