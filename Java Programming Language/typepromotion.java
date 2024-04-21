import java.util.*;
public class typepromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println(a+b);
        System.out.println((float)(a));
        /*TYPE PROMOTION IN EXPRESSIONS
         * 1. Java automatically promotes each byte , short , or char operand to int when evaluating an expresson.
         * 2. If one operand is long, float or double the whole expression is promoted to long, float, or double respectively.
         */
    }
}
