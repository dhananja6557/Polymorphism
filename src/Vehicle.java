public class Vehicle {
    void drive() {
        System.out.println("Drive Speed Limit 100kmph");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Drive Speed Limit 150kmph");
    }
}
class RunPro {
    public static void main(String[] args) {
        Vehicle c = new Car();
        Vehicle v = new Vehicle();
        c.drive();
        v.drive();
    }
}