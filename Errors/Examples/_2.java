package Errors.Examples;

public class _2 {
    public static void main(String[] args) {
        try {

            // int res = 10 / 0;

            // NullPointerException
            String s = null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e) {
            System.out.println(
                "Caught ArithmeticException: " + e);
        }
        catch (NullPointerException e) {
            System.out.println(
                "Caught NullPointerException: " + e.getMessage());
        }

        System.out.println("Continue");
    }    
}
