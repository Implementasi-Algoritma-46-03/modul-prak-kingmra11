import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        int[][] matriks = new int[N][N]; // untuk baris dan kolom

        for (int i=0; i<N; i++) { // untuk memasukan angka dimulai dari baris kiri ke kanan
            for (int j=0; j<N; j++) {
                matriks[i][j] = s.nextInt(); // semisal [0][0]= matriks 1
            }
        }

        for (int i=N-1; i>=0; i--) { // untuk membalikan angka yang awaknya berurutan jadi terbalik
            for (int j=0; j<N; j++) {
                System.out.print(matriks[i][j]);
                if (j < N -1)
                    System.out.print(" "); // untuk memberi spasi tiap angka
            }
            System.out.println();     
        }
    }
}