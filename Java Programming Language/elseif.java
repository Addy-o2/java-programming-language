import java.util.*;
public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A>B) {
            System.out.println(A); 
        }
        else if (A==B) {
            System.out.println("A=B");
        }
        else {
            System.out.println(B);
        }
    }
}
