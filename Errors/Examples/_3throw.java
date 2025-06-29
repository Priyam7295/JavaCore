package Errors.Examples;

// throws example

// it 

public class _3throw {

    public static int calc(int x , int u ){
        if(u==0){
            throw new ArithmeticException("Divide by 0 not possible");
        }
        System.out.println(x/u);
        return x/u;
    }
    public static void main (String args[]){
    
        try {
            int x=9;
            int y=0;
            int result = calc(x,y);
            System.out.println(result);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Continue");

    }
}
