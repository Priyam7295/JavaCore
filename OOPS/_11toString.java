package OOPS;

class Animal{
    public int age;
    public String noise;


    // we can over ride this toString method which is called when we print the object;
    // public String toString(){
    //     return "---"+age+"---";
    // }

}

public class _11toString {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.age=12;
        dog.noise="Bhau Bhau!";

        System.out.println(dog);
    }
}
