import java.util.*;

public class incomecal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Income = sc.nextInt();
        int tax;
        if (Income < 500000) {
            tax = 0;
        } else if (Income >= 500000 && Income < 1000000) {
            tax = 10 * Income / 100;
        } else {
            tax = 30 * Income / 100;
        }
        System.out.println("Your tax is:" + tax);
    }
}
