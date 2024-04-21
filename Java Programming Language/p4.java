/*write a Java program to get a number from the user and print whether it is positive or negative. */
import java.util.*;
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>0) {
            System.out.println("Your number is positive.");  
        } else {
            System.out.println("Your number is negative.");
            
        }
    }
}
