package TakingInput;

import java.util.Scanner; // importing Scanner class from java.util package

public class input1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Username");

        String userName = myObj.nextLine();
        System.out.println("Username is: "+userName);
        System.out.println(userName.getClass());


        int n;
        n = myObj.nextInt();

        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            int num = myObj.nextInt();
            arr[i] = num;
        }

        for(int num:arr){
            System.out.print(num+" ");
        }

    }
}
