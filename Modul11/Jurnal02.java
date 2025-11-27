import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine();

        kalimat = kalimat.trim();
        kalimat = kalimat.replaceAll("\\s+", " ");

        System.out.println(kalimat);
    }
}