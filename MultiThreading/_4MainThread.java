package MultiThreading;

// When a Java program starts up, one thread begins running immediately.
//  This is usually called the main thread of our program,
//  because it is the one that is executed when our program begins. 

// It it the thread from which other "child" threads will be spawned
// Often, it must be the last thread to finish execution because it performs various shutdown actions


class ChildThread implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");
        }
    }
}

public class _4MainThread {
    public static void main(String args[]){

        // Getting reference to the Main thread
        Thread t = Thread.currentThread();
        System.out.println(t);

        // Changing the name of the Main thread

        t.setName("PriyamThread");
        System.out.println(t.getName());

        System.out.println("\nPriority of the main thread\n");
        System.out.println(t.getPriority());
        System.out.println();
        // max priority =10
        // min =1 , and 5 is default normal 
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t.getPriority());

        // creating object
        ChildThread ch = new ChildThread();
        Thread child_thread = new Thread(ch);

        child_thread.run();


        // another way of directlt creating child here only
        Thread chh = new Thread(){
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println("Hi");
                }
            }
        };

        chh.run();

    }
}
