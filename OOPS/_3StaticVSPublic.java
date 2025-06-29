package OOPS;

public class _3StaticVSPublic {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    
    }

      // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        
        // NOTES:--------\
        // 1. static method-> it can be accessed without creating an object of the class, 
        // 2. unlike public->which can only be accessed by objects
        // 3.
        myStaticMethod();
        // myPublicMethod();  error- since this is public method, and so we cannot call ie before creating obj of _3StaticVSPublic

        _3StaticVSPublic obj= new _3StaticVSPublic();
        obj.myPublicMethod();
    }
}
