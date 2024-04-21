import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("You have right to vote, right to drive, e.t.c");
        } 
        if (age>13 && age<18) {
            System.err.println("teenager");
        }else {
            System.out.println("You are not adult yet.");
        }
    }
}
