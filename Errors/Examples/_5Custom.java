package Errors.Examples;


class ChutiyaHaiKyaException extends Exception{

    public ChutiyaHaiKyaException(String message) {
        super(message);
    }
    

}

public class _5Custom {
   

    public static int divide(int x , int y) throws ChutiyaHaiKyaException {
        if(y==0) throw new ChutiyaHaiKyaException("Gandu 0 se divide kaise kr rha hai");
        return x/y;
    }

    public static void main(String[] args) {
        int x=10;
        int y=0;
        System.out.println("Start");
        
        try {
            int ans = divide(x, y);
            System.out.println(ans);
        } catch (ChutiyaHaiKyaException e) {
            // TODO: handle exception
            System.out.println(e);
        }

        System.out.println("Continue");


    
}

}
