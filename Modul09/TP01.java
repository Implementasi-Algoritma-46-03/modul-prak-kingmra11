import java.util.*;
public class TP01 {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String hasil = "";
        for(int i = 1;i>= 1 && i <= 100; i++){
            if (i == a+1){
                break;
            }
            if (i % 2 == 0){
                hasil = i + " Genap";
            } else {
                hasil = i + " Ganjil";
            }
            System.out.println(hasil);
        }
    }
}