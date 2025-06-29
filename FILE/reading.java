package FILE;

import java.io.File;
import java.util.Scanner;

public class reading {
    public static void main(String[] args) {
        
        try {
            File myFile = new File("FILE/mytxt.txt");
            Scanner myScanner = new Scanner(myFile);

            while(myScanner.hasNextLine()){
                String oneline = myScanner.nextLine();
                System.out.println(oneline);
            }
            myScanner.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}   
