package FILE;

import java.io.File;

public class delete {
    public static void main(String[] args) {


        // deleting a file
        File myFile = new File("FILE/mytxt.txt");

        try {
            if(!myFile.exists()){
                System.out.println("File is not there");
            }
            else if(myFile.delete()){
                System.out.println("Deleted tje file");
            }
            else
            {
                System.out.println("Failed to delete the file.");
            
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // deleting a folder
        // similar nway but it needs to be empty
        // so first delete all files
        // then delete folfer
        File folder = new File("myFolder");

        // Delete all files inside the folder
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.delete()) {
                    System.out.println("Deleted file: " + f.getName());
                } else {
                    System.out.println("Failed to delete: " + f.getName());
                }
            }
        }

        // Delete the folder itself
        if (folder.delete()) {
            System.out.println("Folder deleted: " + folder.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
        
    }
}
