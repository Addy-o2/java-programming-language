public class funcover {
    //function to add 2 integers
    public static int sum(int a, int b) {
        return a+b;
    }
    //function to add 3 numkbers
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 10));
        System.out.println(sum(5, 10, 50));
    }
}
