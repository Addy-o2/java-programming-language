import java.util.*;
public class laregesst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if ((A>=B) && (A>=C)) {
            System.out.println(A);
        } 
        else if (B>=C) {
            System.err.println(B);
        }
        else {
            System.out.println(C);
        }
    }
}
