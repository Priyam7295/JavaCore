public class _13ForLoops {
    public static void main(String args[]){
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
          }
        System.out.println();

        for(int i=0;i<3;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 
        String [] Cars ={"Volvo","Bmw","Audi"};

        for(String i:Cars){
            System.out.println(i);
        }

        int i = 0;
            while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }

        }

        // break and continue are as it is, as in cpp
    }
}
