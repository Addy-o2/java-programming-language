import java.util.*;
public class pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String mark = marks>33? "pass" : "fail";
        System.out.println(mark);
    }
}
