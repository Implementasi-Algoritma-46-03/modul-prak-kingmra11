import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();       // jumlah kata
        String[] b = new String[a];   // array input
        String[] hasil = new String[a]; // array hasil decode

        for (int i = 0; i < b.length; i++) {
            b[i] = scan.next().trim(); // baca tagar
        }

        for (int i = 0; i < b.length; i++) {
            // hilangkan tanda #
            String kata = b[i].substring(1);

            // reverse kata
            String balik = "";
            for (int j = kata.length() - 1; j >= 0; j--) {
                balik += kata.charAt(j);
            }

            // ambil huruf kapital saja
            String bersih = "";
            for (int j = 0; j < balik.length(); j++) {
                char c = balik.charAt(j);
                if (c >= 'A' && c <= 'Z') {
                    bersih += c;
                }
            }

            hasil[i] = bersih;
        }

        // output hasil
        for (int i = 0; i < hasil.length; i++) {
            System.out.printf("%s ", hasil[i]);
        }

        scan.close();
    }
}
