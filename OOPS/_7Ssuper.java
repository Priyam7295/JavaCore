package OOPS;
class Animal{
    int danger;
    Animal(int danger){
        this.danger=danger;
    }

    Animal(){

    }
    void sound(){
        System.out.println("Do not know the sound");
    }
};

class Dog extends Animal{
    Dog(){
        super(99); //call constructor of parent , no need bythe way
    }
    void sound(){
        super.sound(); // can call the parent
        System.out.println("Bhaw Bhaw");
    }
};  

public class _7Ssuper {
    public static void main(String[] args) {
        Dog germanS = new Dog();
        germanS.sound();
        System.out.println(germanS.danger);
        
    }
}
