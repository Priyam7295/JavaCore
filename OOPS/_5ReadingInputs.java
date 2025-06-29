package OOPS;
import java.util.Scanner;

public class _5ReadingInputs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Numbers");
        for(int x:arr){
            System.out.print(x+" ");
        }
        sc.close();
    }    
}
