package OOPS;


// ex-1
interface Animal {
    public void animalSound(); 
    public void sleep(); 
}

class Pig implements Animal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
    public void sleep() {
      System.out.println("Zzz");
    }
}

// ex-2
interface FirstInterface {
    public void myMethod();
}
  
interface SecondInterface {
    public void myOtherMethod(); 
}
  
class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}



public class _10Interface {
    public static void main(String[] args) {
        Pig myPig = new Pig();  
        myPig.animalSound();
        myPig.sleep();
    }
}
