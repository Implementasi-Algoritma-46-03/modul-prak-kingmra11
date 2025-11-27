import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] freq = new int[10000];
        int x;

        while (true) {
            x = input.nextInt();
            if (x == -1)
                break;
            freq[x]++;
        }

        int modus = 0;
        int maxFreq = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                modus = i;
            } else if (freq[i] == maxFreq && i > modus) {
                modus = i;
            }
        }

        System.out.println(modus);
    }
}