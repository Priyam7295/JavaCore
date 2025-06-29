package OOPS;

class calculator{
    static int x=8;
    public int sum(int a , int b){
        return a+b;
    }
};

public class _1Objects {
    public static void main(String[] args) {

        // Unlike in cpp, where we can declare objects in stack and heap also
        // class myobj; stack
        // class* myobj = new myobj(); heap

        // in java only in heap
        calculator mycalc = new calculator();
        System.out.println(mycalc.sum(12,1 ));

        System.out.println(calculator.x); //no objects needed because x is static variable of class calculator, and hence it is shared for all objects

    }
}
