package OOPS;

class calc {
    int cx=0;
    int assign(){
        cx=8;
        System.out.println("This is coming from other file in same package "+cx);
        return 0;
    }
    
}


public class _2ClassAttributes {
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void myMethod(){
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        _2ClassAttributes myobj = new _2ClassAttributes();
        System.out.println(myobj.fname);
        System.out.println(myobj.age);
        myMethod();

        calc c1= new calc();
        System.out.println(c1.cx);
        c1.assign();
        System.out.println(c1.cx);

        int []arr = new int[2];
        // try {
        //     arr[4]=6;
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println(e);
        // }

    }
}
