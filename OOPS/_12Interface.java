package OOPS;

// level1 - interface
// level2 - abstract
// level3 - class

interface Bank{
    // this is final, public and static
    String BankAddress = "Station Road, Madhubani";

    void deposit();
    void withdraw();
    void loan();
    void account();
}


// ḷevel2

abstract class Dev1 implements Bank{
    public void deposit(){
        System.out.println("Your deposit amount: "+100);
    }
}

abstract class Dev2 extends Dev1{
    int creditScore=788;
    public void withdraw(){
        System.out.println("Your withdraw Amount :" + 50);
    }
}

// level3

class Dev3 extends Dev2{
    String address = "Stadium road";
    public void loan(){
        
    }
    public void account(){

    }
}


public class _12Interface {

    public static void main(String[] args) {
        
        // Since we know variables are 
        // final, static and public

        // so , we can not change its value , since final
        // and can access it without creating object , since static

        System.out.println("Address of the Bank is: \n" +Bank.BankAddress+"\n\n");

        Dev3 d = new Dev3();

        d.account();
        d.loan();
        d.deposit();
        d.withdraw();
        System.out.println("Credit score is :"+d.creditScore);

        
    }
    
}
