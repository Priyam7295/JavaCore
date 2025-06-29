public class _16Methods {

    static void myMethod(){
        System.out.println("Function is called");
    }

    static void fullName(String name){
        System.out.println(name+ " raj");
    }

    static void Intro(String name, int age){
        System.out.print("Name: ");
        System.out.print(name + " " + age);
    }
    public static void main(String args[]){
        System.out.println("Priyam");
        myMethod();
        fullName("Priyam");
        Intro("Priyam",22);
    }
}
