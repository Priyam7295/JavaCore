package FILE;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class createwrite {
    public static void main(String[] args) {
        // .createNewFile is used to create file
        // return true if created
        // return false if some file is already there


        // 1. creating a new file
        try {
            File myObj = new File("FILE/mytxt.txt");

            System.out.println(myObj.getName());
            
            if(myObj.createNewFile()){
                System.out.println("File created: "+ myObj.getName() );
            }
            else{
                System.out.println("File is already there");
            }

            // 2. Writing to a file
            try {
                FileWriter myWriter = new FileWriter("FILE/mytxt.txt");
                myWriter.write("Files in Java might be tricky, but it is fun enough!");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
              } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }

        } catch (Exception e) {
            System.out.println("An errir occured");
            System.out.println(e);
            
        }

        

    }
}
