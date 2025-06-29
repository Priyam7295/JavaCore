package TakingInput;
import java.util.Scanner;
import java.util.ArrayList;

public class input2 {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        int n= myScanner.nextInt();
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        System.out.println("Enter edges");
        for(int i=0;i<n;i++){
            int u ,v;
            u=myScanner.nextInt();
            v=myScanner.nextInt();
            ArrayList<Integer> edge = new ArrayList<>();
            edge.add(u);
            edge.add(v);

            edges.add(edge);

        }

        System.out.println("Edges entered:");
        for (ArrayList<Integer> edge : edges) {
            System.out.println(edge.get(0) + " -- " + edge.get(1));
        }

    }
}
