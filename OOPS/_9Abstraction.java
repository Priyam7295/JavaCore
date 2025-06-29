package OOPS;
// abstraction

// abstraction can be used using 
// 1. abstract
// 2. interface

// Abstract class: is a restricted class that cannot be used to create objects 
// (to access it, it must be inherited from another class).

// Abstract method: can only be used in an abstract class, and it does not have a body.
//  The body is provided by the subclass (inherited from).

// abstract class
abstract class Animal{
    // abstract method
    public abstract void animalSound();

    public void sleep(){
        System.out.println("Zzz");
    }

}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: we wee");
    }
}



public class _9Abstraction {
    public static void main(String[] args) {
        
        Pig myPig = new Pig(); 
        myPig.animalSound();
        myPig.sleep();
    }
}
