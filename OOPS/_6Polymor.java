package OOPS;

// overriding example run time polymorphism
class Animal {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }
  
  class Pig extends Animal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  }
  
  class Dog extends Animal {
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }
  }

public class _6Polymor {
    public static void main(String[] args) {
        Animal ani= new Animal();  
        Pig pig= new Pig();  
        Dog dog= new Dog();  

        ani.animalSound();
        pig.animalSound();
        dog.animalSound();
    }
}
