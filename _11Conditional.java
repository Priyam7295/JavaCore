public class _11Conditional {
    public static void main(String args[]){
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }
        else{
            System.out.println("x is smaller than y");
        }

        int age=2;
        if(age<5){
            System.out.println("Kar kya rha hai yaha pe");
        }
        else if(age>=5 && age<18){
            System.out.println("No voting rights");
        }
        else{
            System.out.println("Yes you can vote");
        }
        System.out.println("\n\n");
        boolean check=true;
        System.out.println( (check==true)? "Yes":"No"  );
    }
}
