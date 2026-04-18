package com.pluralsight;
import java.util.Scanner;
//com.pluralsight.Vehicle Class
public class VehicleApp {
    static Scanner theScanner = new Scanner(System.in);
    //create variables to use
    static double vehicleId = 0;
    static String make = "";
    static String color = "";
    static int odometerReading = 0;
    static float price = 0;

    public static void main(String[] args) {
        //Creating an Array that passes 20 cars
        Vehicle[] vehicle = new Vehicle[20];

        //Now fill the array 6 spots with cars
        new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
    }




    public static void askQuestions() {
        System.out.print("What is your com.pluralsight.Vehicle ID?");
       vehicleId = theScanner.nextLong();
       vehicleId = setVehicleId(vehicleId);

    }
}
