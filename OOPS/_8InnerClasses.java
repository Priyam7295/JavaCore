package OOPS;

// In java we can create nested classes like this
// As we know classes can not be private and protected in java
// class can only be public or default/

// But the inner class can be private and protected as well

// Inner class can access the attributes of the outer class, even when it is private

// 🔒 private → Only this class can access
// 🟨 default (no modifier) → Only classes in the same package
// 🛡️ protected → Classes in the same package + any subclass (even if subclass is in a different package)
// 🌐 public → Anyone can access


class OuterClass{
    int x;
    private int y;
    protected class InnerClass{
        int y=5;

        void print(){
            System.out.println(y);
        }
    }
}

public class _8InnerClasses {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter. new InnerClass();
        System.out.println(myOuter.x);
        System.out.println(myInner.y);
    }
}
