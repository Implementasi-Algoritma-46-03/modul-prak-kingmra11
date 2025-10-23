import java.util.Scanner;
public class Jurnal01 {
    public static void Mahasiswa( String a, String b, int c){
        String time = "";
        if (c >= 6 && c <= 11){
            time = "pagi";
        }else if (c >= 12 && c <= 14){
            time = "siang";
        }else if (c >= 15 && c <= 17){
            time = "sore";
        }else if (c >= 18 || c <= 5) {
            time = "malam";
        }else {
            System.out.println();
        }
        System.out.println("Halo " + a + ". Selamat " + time + ".");
        System.out.println("Halo " + b + ". Selamat " + time + ".");
    }

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama1 = scanner.nextLine();
        String nama2 = scanner.nextLine();
        int waktu = scanner.nextInt();

        Mahasiswa(nama1, nama2, waktu);
      scanner.close();
    }
}
