public class _07TypeCasting {
    public static void main(String args[]){
        // Type casting is when you assign a value of one primitive data type to another type

        // Widening Casting (automatically) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double

        
        // double -> float -> long -> int -> char -> short -> byte
        // Narrowing Casting (manually) - converting a larger type to a smaller size type


        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(Integer.BYTES);
        System.out.println(Double.BYTES);
    
        System.out.println(myInt);     
        System.out.println(myDouble);   


        // if from larger to smaller type , convert manually
        double mydouble = 9.78d;

        int myint = (int)mydouble;
        System.out.println(mydouble);
        System.out.println(myint);

        // example
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        float percentage = ((float) userScore/maxScore)*100f ;
        System.out.println(percentage);

    } 
}
