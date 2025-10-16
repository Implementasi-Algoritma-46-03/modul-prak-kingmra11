import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int kode = input.nextInt();
        int jumlah = input.nextInt();

        String namaMenu = "";
        int hargaSatuan = 0;

        switch (kode) {
            case 1:
                namaMenu = "Nasi Goreng";
                hargaSatuan = 15;
                break;
            case 2:
                namaMenu = "Mie Goreng / Nyemek";
                hargaSatuan = 18;
                break;
            case 3:
                namaMenu = "Kwetiau Goreng / Nyemek";
                hargaSatuan = 20;
                break;
            case 4:
                namaMenu = "Capcay Goreng / Kuah";
                hargaSatuan = 23;
                break;
            default:
                System.out.println("Kode menu tidak valid!");
                input.close();

                return;
        }

        int totalHarga = hargaSatuan * jumlah;

        System.out.println(namaMenu + " " + jumlah + " buah, total harga Rp. " + totalHarga + ".000");

        input.close();
    }
}

