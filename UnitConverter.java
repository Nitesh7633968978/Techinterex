import java.util.*;

public class UnitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display the menu
            System.out.println("Unit Converter Tool");
            System.out.println("1. Length");
            System.out.println("2. Mass");
            System.out.println("3. Temperature");
            System.out.println("4. Volume");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertLength(scanner);
                    break;
                case 2:
                    convertMass(scanner);
                    break;
                case 3:
                    convertTemperature(scanner);
                    break;
                case 4:
                    convertVolume(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // Length conversion method
    private static void convertLength(Scanner scanner) {
        System.out.println("Length Conversion");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Meters");
        System.out.print("Choose a conversion (1-2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println(value + " meters = " + (value / 1000) + " kilometers");
                break;
            case 2:
                System.out.println(value + " kilometers = " + (value * 1000) + " meters");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    // Mass conversion method
    private static void convertMass(Scanner scanner) {
        System.out.println("Mass Conversion");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");
        System.out.print("Choose a conversion (1-2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println(value + " kilograms = " + (value * 2.20462) + " pounds");
                break;
            case 2:
                System.out.println(value + " pounds = " + (value / 2.20462) + " kilograms");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    // Temperature conversion method
    private static void convertTemperature(Scanner scanner) {
        System.out.println("Temperature Conversion");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose a conversion (1-2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println(value + " Celsius = " + (value * 9/5 + 32) + " Fahrenheit");
                break;
            case 2:
                System.out.println(value + " Fahrenheit = " + ((value - 32) * 5/9) + " Celsius");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    // Volume conversion method
    private static void convertVolume(Scanner scanner) {
        System.out.println("Volume Conversion");
        System.out.println("1. Liters to Gallons");
        System.out.println("2. Gallons to Liters");
        System.out.print("Choose a conversion (1-2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println(value + " liters = " + (value * 0.264172) + " gallons");
                break;
            case 2:
                System.out.println(value + " gallons = " + (value / 0.264172) + " liters");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
