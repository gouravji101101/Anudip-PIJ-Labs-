package Session3_Lab;

import java.util.Scanner;

public class Car {
    private String make;
    private String model;
    private short year;
    private int price;

    // Constructor
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car Make: ");
        String make = sc.nextLine();

        System.out.print("Enter Car Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Car Year: ");
        short year = sc.nextShort();

        System.out.print("Enter Car Price: ");
        int price = sc.nextInt();

        Car userCar = new Car(make, model, year, price);
        userCar.displayInfo();

        sc.close();
    }
}
