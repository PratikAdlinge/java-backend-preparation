import java.util.Scanner;

class Vehicle {
   String vehicle_NO; double price;String brand;
   Scanner sc=new Scanner(System.in);
   void getVehicleDetails() {
    System.out.println(" Enter the Vehicle No , Brand And Price of vehicle");
    vehicle_NO=sc.next();
    brand=sc.next();
    price=sc.nextDouble();
   } 
}
class Car extends Vehicle {
    int no_of_Door;
    void getCarDetail() {
        System.out.println("no of doors have a car ");
        no_of_Door=sc.nextInt();
    }
    void displayCarDetails() {
        System.out.println("Car Details:");
        System.out.println("Vehicle Number:"+vehicle_NO);
        System.out.println("Brand:"+brand);
        System.out.println("Price:"+price);
        System.out.println("Number of Doors:"+no_of_Door);
    }
}
class Bike extends Vehicle {
    String power;
    void getBikeDetail() {
        System.out.println("enter engine power");
        power=sc.next();

    }
    void displayBikeDetails() {
       System.out.println("Bike Details:");
        System.out.println("Vehicle Number:"+vehicle_NO);
        System.out.println("Brand:"+brand);
        System.out.println("Price:"+price);
        System.out.println("Engine cc:"+power); 
    }
}
public class P04_HierarchicalInheritance {
    public static void main(String[] args) {
        Car car=new Car();
        Bike bike1=new Bike();
        car.getVehicleDetails();
        car.getCarDetail();
        car.displayCarDetails();
        bike1.getVehicleDetails();
        bike1.getBikeDetail();
        bike1.displayBikeDetails();
    }
}
