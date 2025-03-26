
//Write a program in Java in which a subclass constructor invokes the constructor of the
//super class and instantiate the values.
import java.util.Scanner;

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Brand: " + brand + "\nSpeed: " + speed);
    }
}

class Car extends Vehicle {
    int gears;

    Car(String brand, int speed, int gears) {
        super(brand, speed);
        this.gears = gears;
    }

    void showDetails() {
        display();
        System.out.println("Gears: " + gears);
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car brand: ");
        String brand = scanner.nextLine();
        
        System.out.print("Enter car speed: ");
        int speed = scanner.nextInt();
        
        System.out.print("Enter number of gears: ");
        int gears = scanner.nextInt();

        scanner.close();

        Car car = new Car(brand, speed, gears);
        car.showDetails();
    }
}

