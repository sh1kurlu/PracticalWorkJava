package week01;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); 
        // If we scan 'int' then we type 'nextInt'
        long b = scanner.nextLong();
        // If we scan 'long' then we type 'nextLong'
        double c = scanner.nextDouble();
        // If we scan 'double' then we type 'nextDouble'
        
        double sum = a + b + c;
        /*  
        
         If we get to choose the most suitable data type
         for the sum of various data types, we would pick the one that can 
         accommodate the widest range of possible values

         In this case the best option here the largest which is 'double'

        */
        

        System.out.println(sum);

        scanner.close();
    }
}
