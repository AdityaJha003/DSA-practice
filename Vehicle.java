// design a vehicle class and realted classes
public class Vehicle {
    private String brand;
    private String color;
    private int year;

    public Vehicle(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String color, int year, int numberOfDoors) {
        super(brand, color, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String color, int year, boolean hasSidecar) {
        super(brand, color, year);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", "Red", 2022);
        Car car = new Car("Honda", "Blue", 2021, 4);
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Black", 2020, true);

        System.out.println(
                "Vehicle: " + vehicle.getBrand() + ", Color: " + vehicle.getColor() + ", Year: " + vehicle.getYear());
        System.out.println("Car: " + car.getBrand() + ", Color: " + car.getColor() + ", Year: " + car.getYear()
                + ", Number of Doors: " + car.getNumberOfDoors());
        System.out.println("Motorcycle: " + motorcycle.getBrand() + ", Color: " + motorcycle.getColor() + ", Year: "
                + motorcycle.getYear() + ", Has Sidecar: " + motorcycle.hasSidecar());
    }
}