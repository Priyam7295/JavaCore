package MultiThreading;

// This method is recommended as it uses interface
// our class implemets this interface. and then create a thread and run it

// runnable interface looks something like this
// interface Runnable{
    // public void run();
// }

class A implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().threadId() + " is running ");
    }
}

public class _2createthread2 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            
            // Creating thread
            A objA= new A();

            Thread t1 = new Thread(objA);
            t1.start();

        }
    }   
}
