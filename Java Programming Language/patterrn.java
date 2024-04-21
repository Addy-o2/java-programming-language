public class patterrn {
    public static void main(String[] args) {
        triangle(3);
    }
    public static void triangle(int height){
        int i = 1;
        while (i<=height) {

            int j=i;

            while (j>0) {
                System.out.print(" * ");
                j--;
            }
            i++;
             System.out.println();
        }
    }
}

