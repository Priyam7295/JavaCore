public class _14Arrays {
    public static void main(String args[]){
        int []arr =  new int[5];
        // Because Java does not expose pointers to the developer like C/C++ does.
        // so we cannot run *arr
        arr[0]=89;
        System.out.println(arr[0]);
        System.out.println(arr[4]);

        // In java , arrays are defined this way only, 
        // and it is allocated in heap memory
        // Unlike in cpp  we can define in stack(during compile) and in heap(during runtime)
        // In java, in stack we define other things like string num , etc, but arrays in heap
        // delete is not used, java has garbage collector inside.

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        cars[0] = "Opel";
        System.out.println(cars[0]);

        System.out.println(cars.length);
    }
}
