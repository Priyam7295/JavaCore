package OOPS;

import OOPS.calc;

class myclass{
    int x;
    myclass(int x){
        this.x=x;
    }
    void mymethd(){
        System.out.println("Called");
    }
};

class myclass2{
    private int x;
    myclass2(int x){
        this.x=x;
    }

    public void getX(){
        System.out.println(x);
    }
};

class mydog{
    static public String bark ="Bhau Bhau";
};

public class _4Construct {
    public static void main(String[] args) {
        myclass obj = new myclass(99);
        System.out.println(obj.x);
        obj.mymethd();

        myclass2 obj2 = new myclass2(4);
       obj2.getX();

       calc mycal = new calc();

       mycal.assign();
       System.out.println(mydog.bark);

    }
}
