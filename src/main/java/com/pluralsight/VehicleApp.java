package com.pluralsight;
import java.util.Arrays;
import java.util.Scanner;
//com.pluralsight.Vehicle Class
public class VehicleApp {
    static Scanner theScanner = new Scanner(System.in);
    //create variables to use
    static long vehicleId = 0;
    static String make = "";
    static String color = "";
    static int odometerReading = 0;
    static float price = 0;

    //Creating an Array that passes 20 cars
    static Vehicle[] vehicle = new Vehicle[20];
    static int vehicleCounter = 0;

    public static void main(String[] args) {

           //Now fill the array 6 spots with cars and store it in the array
           vehicle[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
           vehicle[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
           vehicle[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
           vehicle[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
           vehicle[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
           vehicle[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

            menuLoop();
    }

    //Creating a method to help loop the questions
    public static void menuLoop(){

        //Using a loop to ask the questions
        for(int i = 0; i < vehicle.length; i++ ){
            //Prompt the user to press a button
            System.out.println("===Please type in a number===");
            System.out.println("-----------------------------");
            System.out.println("1. List all vehicle");
            System.out.println("2. Search by make/model");
            System.out.println("3. Search by price range");
            System.out.println("4. Search by color");
            System.out.println("5. Add a vehicle");
            System.out.println("6. Quit");
            System.out.println("Please enter your command");

            //store the users answer
             int usersChoice = theScanner.nextInt();

             switch(usersChoice){
                 case 1:
                     displayCarsID();
                     break;
                 case 2:



             }
        }

    }

    //Creating a method to display all the cars
    public static void displayCarsID(){
        for (Vehicle value : vehicle) {
            System.out.println(value.getMakeModel());
        }
    }

    //Creating a method





}
