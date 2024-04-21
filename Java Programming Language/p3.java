/*Enter cost of three items from the user (using float data type) - a pencil, a pen, and an eraser. You have to output the total cost of the items back to the user as their bill.
 * (Add on: you can also try adding 18% gst tax to the items in the bills as an advanced problem)
 */
import java.util.*;
public class p3 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the cost pencil : ");
     float a = sc.nextFloat();

     System.out.println("Enter the cost pen : ");
     float b = sc.nextFloat();

     System.out.println("Enter the cost eraser : ");
     float c = sc.nextFloat();

     float total = (a+b+c);
     System.out.println("Total price : " + total);
// Add on
float gst = total + (0.18f*total);
System.out.println("Total with gst : " + gst);
    }
}
