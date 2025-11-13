import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        String teks = input.nextLine();
        teks = teks.toLowerCase();

        int hasil = 0;
        for(int i = 0; i < teks.length(); i++){
            char huruf = teks.charAt(i);
            if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o'){
                hasil++;
            }
        }
        System.out.println(hasil);
    }
}