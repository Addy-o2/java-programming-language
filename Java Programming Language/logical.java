public class logical {
    public static void main(String[] args) {
        /*&& Logical AND
        t+t = t
        t+f = f
        f+t = f
        f+f = f*/
        System.out.println( (3>2) && (2>1) );

        /* || logical or
         t+t = t
         t+f = t
         f+t = t
         f+f = f
         */
        System.out.println( (3<2) || (2<1) );
         
        /* ! Logical not
        it makes the answers opposite  
         */

         System.out.println(!(3>5));
    }
}
