package Errors.Examples;


public class _1 {
    public static void main(String[] args) {
        int n=10;
        int m=0;

        try {
            int ans=n/m;
            System.out.println("Answer: "+ans);
        } catch (ArithmeticException e) {
            System.out.println("Division with 0 is not allowed");
        }
        finally{
            System.out.println("Program will continue to run");
        }
        System.out.println("Done");
    }
}
