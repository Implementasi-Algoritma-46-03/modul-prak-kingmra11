import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int sum = 0;                          
        int x = sc.nextInt();                 

        
        while (x != 0) {
            sum += x;        
            x = sc.nextInt(); 
        }

        System.out.println(sum); 
        sc.close();              
    }
}

