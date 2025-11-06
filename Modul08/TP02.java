import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        long N = sc.nextLong();                
        sc.close();                            

        long hasil = 0;                        

        
        while (N != 0) {
            long digit = N % 10;              
            hasil = hasil * 10 + digit;       
            N /= 10;                          
        }

        System.out.println(hasil);            
    }
}