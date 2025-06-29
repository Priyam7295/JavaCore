package Errors;

class Person{
    public static Boolean checkAge(int age){
        if(age>18){
            return true;
        }
        return false;
    }

}


public class exception {
    public static void main(String[] args) {
        System.out.print("Start\n");

        // error- coding mistake, input valid , or any unexpected situations

        // Exception Handling (try and catch)
        // catches error during runtime - so your program doesn't crash.

        int[] arr={1,2,3};
        try {
           System.out.println(arr[3]); 
        } catch (Exception e) {
            System.out.println("Something went wrong\n");
            System.out.println(e);
        }
        System.out.println("Next line\n\n");

        // try {
        //    System.out.println(arr[3]); 
        // } catch (ArithmeticException e) {
        //     System.out.println("Something went wrong\n");
        //     System.out.println(e);
        // }
        // System.out.println("Next line\n\n");
        
        
        // finally - this runs, regardless of the result
        
        try {
            int[] myNumbers  = {42,32,4};
            System.out.println(myNumbers[23]);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("The 'try catch' block finished");
        }
        
        
        // throw == using this we can create our own custom error.
        // many exception types available in Java
        // : ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException,
        int age=13;
        try {
            if (Person.checkAge(age)) {
                System.out.println("Valid");
            } else {
                throw new ArithmeticException("Access denied - You must be at least 18 years old.");
            }
            
            
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Next line\n\n");  // ✅ Now this prints only if no exception
        
        
    }   
    
}
