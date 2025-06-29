package Errors.Examples;

public class _4throws {

    // thrrows expection means, it is responsibilty of from where I am calling to handle this exception
    public static void riskyMethods() throws ArithmeticException{
        int result =10/0;
        System.out.println(result);
    }
    public static void main(String[] args) {
        
        try {
            
            riskyMethods();
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e);
        }

        System.out.println("Continue running program");

    }
}
