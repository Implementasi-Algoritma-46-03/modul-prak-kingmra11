import java.util.*;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        boolean iniPrima = true;

        if (N <= 1) {
            iniPrima = false;
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    iniPrima = false;
                    break;
                }
            }
        }
        System.out.println(iniPrima ? "YA" : "BUKAN");
    }
}
