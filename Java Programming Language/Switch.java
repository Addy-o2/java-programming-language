import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number) {
            case 1: System.out.println("Samose");
            break;
            case 2: System.out.println("Burger");
            break;
            case 3: System.out.println("Milk Shake");
            break;
            default : System.out.println("wake up"); 

        }
    }  
}