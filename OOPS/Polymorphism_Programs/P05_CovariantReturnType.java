package OOPS.Polymorphism_Programs;
class Vehicle {
    Vehicle getVehicle(){
        System.out.println("vehicles:");
        return this;
    }
}
class Car extends Vehicle {
    @Override
    Car getVehicle() {
    super.getVehicle();
    System.out.println("car:");
    return this;
    }
}
class Bike extends Vehicle {
    @Override
    Bike getVehicle () {
        System.out.println("bike:");
        return this;
    }
}
public class P05_CovariantReturnType {
    public static void main(String[] args) {
         Car c1=new Car();
         Bike b1=new Bike();
         c1.getVehicle();
         b1.getVehicle();
    }
}
