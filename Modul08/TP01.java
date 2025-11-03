import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long N = input.nextLong(); 
        input.close();

        long amoeba = 30; 
        int waktu = 0;    

        
        while (amoeba < N) {
            amoeba *= 2;    
            waktu += 15;    
        }

        System.out.println(waktu);
    }
}