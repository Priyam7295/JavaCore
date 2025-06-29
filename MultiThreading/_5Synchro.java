package MultiThreading;


class SharedTask{
    public int counter=0;
    public synchronized void increase(){
        counter++;
    }
};

interface myI {
    public void print();    
}

class p implements myI{
    public void print(){
        System.out.println("Calling from class p");
    }
}




public class _5Synchro {
    public static void main(String[] args) {
        SharedTask st = new SharedTask();
        System.out.println(st.counter);

    
        // Since  
        // since runnable is a funcrional interface
        Runnable task1 = new Runnable() {
            public void run() {
                for(int i=0;i<10000;i++) st.increase();
            }
        };
        
        Thread t1 = new Thread(task1);
        
        Runnable task2 = new Runnable() {
            public void run() {
                for(int i=0;i<10000;i++) st.increase();
            }
        };

        Thread t2= new Thread(task2) ;

        t1.start();
        t2.start();

        try {
            //waiting for both task to finish working 
            t1.join(); //
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(st.counter);




    }   
}
