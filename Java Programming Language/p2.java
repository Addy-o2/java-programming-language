/*in a program input the side of a square. You have to output the area of the square. */
import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side :");
        int a = sc.nextInt();
        int area = a*a;
        System.out.println("Area = " + area); 
    }
}
