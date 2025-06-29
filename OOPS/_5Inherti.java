package OOPS;

class Vehicle {
    public String brand = "Ford";     
    public void honk() {                   
      System.out.println("Tuut, tuut!");
    }
};


class Car extends Vehicle {
    public String modelName = "X5"; 
    
    Car() {
        brand = "BMW";  
    }
    public void set(String car){
        brand=car;
    }
};


public class _5Inherti {
    public static void main(String args[]){
        Car mycar = new Car();
        mycar.brand="no car"; //can do
        mycar.set("loda"); //can do
        System.out.println(mycar.brand);
        System.out.println(mycar.modelName);
    }
}
