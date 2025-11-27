public class BasicInheritance {
    public static void main(String[] args) {
        Vehicle car1 = new Car("Audi", "1995", 2);
        Vehicle car2 = new Car("Ferrari", "2000", 4);
        System.out.println(car1);
        System.out.println(car2);
    }
}

class Vehicle {
    public String brand;
    public String year;

    Vehicle() {
        System.out.println("Default constructor");
    }

    Vehicle(String brand, String year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Vehicle param constructor");
    }
}

class Car extends Vehicle {
    public int numberOfDoors;

    Car(String brand, String year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    public String toString() {
        return String.format("Car of brand=%s, year=%s has numberOfDoors=%d", this.brand, this.year, this.numberOfDoors);
    }
}