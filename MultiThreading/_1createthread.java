package MultiThreading;

// this method of creating thread is using
// extending a thread class
// but here the issue is , as we know we can not do multiple inhertiance
// so if I have a class A inhertired from class Z, then we cannot extend  thread


// class A is a thread because it inherits from the Thread class, 
// and it tells the thread what to do by overriding the run() method.

class A extends Thread{

    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
        }
    }
}

class B extends Thread{

    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Helo");
        }
    }
}


class MultiThreading extends Thread{
    public void run(){
        System.out.println(Thread.currentThread());
    }
}




public class _1createthread {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        objA.start();
        objB.start();


        // waiting so thread A and thread B to continue
        // Here I am estiamting that in 10s, A and B thread must finish

        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        System.out.println("Done");

        System.out.println("\n\n");
        MultiThreading objM = new MultiThreading();

        objM.run();

    }
}
