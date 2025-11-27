import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        input.nextLine();

        String[] peserta = new String[N];

        for (int i = 0; i < N; i++) {
            peserta[i] = input.nextLine();
        }

        for (int i = 0; i < N; i++) {
            System.out.println("Bulan " + (i + 1) + ": " + peserta[i]);
        }
    }
}