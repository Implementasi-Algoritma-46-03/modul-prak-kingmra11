import java.util.*;

public class TP02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> data = new ArrayList<>();

        String[] angka = sc.nextLine().trim().split("\\s+");

        for (int i = 0; i < angka.length && i < n; i++) {
            data.add(Integer.parseInt(angka[i]));
        }

        Collections.sort(data, Collections.reverseOrder());

        for (int i = 0; i < data.size(); i++) {
            System.out.print(data.get(i));
            if (i < data.size() - 1) System.out.print(" ");
        }
    }
}