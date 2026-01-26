/* 1. Interface Vehicle and FourWheeler with default methods. 
Class Car implements both and calls Vehicle's message using super. */
interface Vehicle {
    default void message() { System.out.println("Inside Vehicle"); }
}
interface FourWheeler {
    default void message() { System.out.println("Inside FourWheeler"); }
}
class Car implements Vehicle, FourWheeler {
    public void message() {
        Vehicle.super.message();
    }
}
public class VehicleCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.message();
    }
}