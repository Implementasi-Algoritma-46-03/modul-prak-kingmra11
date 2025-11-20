import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++){
            for( int j = 1; j <= n; j++){
                System.out.print((i * j) + "  ");
            }
            System.out.println();
        }
          // Kerjakan soalnya di sini
    }
}
