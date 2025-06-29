public class _09Strings {
    // Note that String is a not primitive data type and it has some functions (methods),that we learn here

    public static void main (String args[]){
        // length
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        // 2. 
        txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase()); 

        // 3. .indexOf("locate") - returns the first occurence of
        txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("ea"));

        // 4. .concat
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

    }
}
