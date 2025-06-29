public class _16Methods2 {

    static int calc(int num){
        return 5+num;
    }   

    static int plusMethod(int x, int y) {
        return x + y;
    }
      
    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String args[]){
        System.out.println("Methods");
        System.out.println(calc(10));

        // Fucntion overloading
        // same function but with different params
        System.out.println(plusMethod(12,43));
        System.out.println(plusMethod(12.5,43.6));
    }
}
