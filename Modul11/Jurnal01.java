import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nama = new String[100];
        int index = 0;

        while (true) {
            String n = input.nextLine();

            if (n.equals("-")) {
                break;
            }
            nama[index] = n;
            index++;
        }

        for (int i = 0; i < index; i++) {
            System.out.println("Bulan " + (i + 1) + ": " + nama[i]);
        }
    }
}