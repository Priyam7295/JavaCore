public abstract class _12WhileLoops {
    public static void main(String args[]){
        int ans=0;
        int n=5;
        while(n>0){
            System.out.println("Adding "+ n+" to ans");
            ans+=n;
            n--;
        }
        System.out.println(ans);

        // there is also do while loop same as in cpp

        int num=12;
        do {
            System.out.println(num);
            num++;
        } while (num>13);
    }
}
