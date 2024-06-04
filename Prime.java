import java.util.*;
public class Prime {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter n");
    int n= sc.nextInt();
    for (int i = 2; i <= n; i++) {
        boolean isPrime = true; // Assume i is prime
        
        // Check if i is not prime
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                isPrime = false; // Found a divisor, so i is not prime
                break;
            }
        }
        
        if (isPrime) {
            System.out.print(i + " ");
        }
    }
    
   }

}
