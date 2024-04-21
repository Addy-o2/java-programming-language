/*In a program, input 3 numbers: A,B and C. You have to output the average of these 3 numbers.*/ 
import java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int A = sc.nextInt();
        System.out.println("Enter B");
        int B = sc.nextInt();
        System.out.println("Enter C");
        int C = sc.nextInt();
        int average = (A+B+C)/3;
        System.out.println("Average = "+ average);

    }
}
