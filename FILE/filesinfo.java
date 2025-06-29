package FILE;

import java.io.File;

public class filesinfo {
    public static void main(String[] args) {
        File myfile = new File("FILE/mytxt.txt");
        System.out.println(myfile.getName());
        System.out.println(myfile.getAbsolutePath());
        System.out.println("Writeable: " + myfile.canWrite());
        System.out.println("Readable: " + myfile.canRead());
        System.out.println("Full size in bytes: " + myfile.length());
    }
}
