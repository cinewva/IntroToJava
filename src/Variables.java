public class Variables { // Class "Variables"

    public static void main(String[] args) { // Main method

        // Variable = a memory area that holds data, a box where we put something
        String carBrand = "Volvo"; // Brand of the car
        String carModel = "XC 60"; // Model of the car

        System.out.println("I bought a car brand: " + carBrand); // Print car brand
        System.out.println("It is the model: " + carModel); // Print car model

        // Overwriting
        carModel = "XC 60 facelift"; // Overwrite car model

        System.out.println("I bought a car brand: " + carBrand); // Print car brand
        System.out.println("It is the model: " + carModel); // Print car model, overwritten

        // Declaration
        String name; // Name
        String surname; // Surname
        int age = 34; // Age

        // Initialization
        surname = "Darius"; // Initialize surname
        name = "Galaxy"; // Initialize name
        System.out.println(name + " " + surname + " with age " + age); // Print name, surname, and age
    }
}
