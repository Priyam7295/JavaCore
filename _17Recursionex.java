public class _17Recursionex {
    static int recursive(int n){
        if(n==0) return 0;
        return n + recursive(n-1);
    }

    static int sumFromNToM(int n , int m){
        if(n>m) return 0;

        return n + sumFromNToM(n+1, m);
    }

    public static void main(String args[]){
        System.out.println("Hello");
        int n=10;
        int ans = recursive(n);
        System.out.println(ans);
        System.out.println();
        System.out.println(sumFromNToM(5,10));
        
    }
}
