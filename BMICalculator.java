import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nType 'stop' to quit or press Enter to continue: ");
            String command = scanner.nextLine().trim().toLowerCase();
            if (command.equals("stop")) {
                System.out.println("Closing BMI Calculator...");
                break;
            }

            try {
                System.out.print("Enter your height in meters (e.g., 1.75): ");
                double height = Double.parseDouble(scanner.nextLine());

                System.out.print("Enter your weight in kilograms (e.g., 68): ");
                double weight = Double.parseDouble(scanner.nextLine());

                if (height <= 0 || weight <= 0) {
                    System.out.println("Height and weight must be positive numbers.");
                    continue;
                }

                double bmi = calculateBMI(height, weight);
                String category = getBMICategory(bmi);

                System.out.println("Your BMI is: " + bmi);
                System.out.println("Category: " + category);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numeric values.");
            }
        }

    }

    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 24.9)
            return "Normal weight";
        else if (bmi < 29.9)
            return "Overweight";
        else
            return "Obese";
    }
}
