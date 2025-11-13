import java.util.Scanner;

public class TP03 {
public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        int hasil = hasil(angka);
        System.out.println(hasil);
    }
    
public static int hasil(int a){
        if(a == 1){
            return a;
        }
         return a * hasil(a - 1);
    }
}