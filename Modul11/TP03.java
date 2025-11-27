import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimat = input.nextLine();

        String[] kata = kalimat.trim().split("\\s+");

        System.out.println(kata.length);
    }
}