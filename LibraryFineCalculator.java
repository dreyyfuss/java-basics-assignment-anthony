import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of days overdue: ");
        int days = scanner.nextInt();

        if (days < 0) {
            System.out.println("Invalid input. Days overdue cannot be negative.");
            return;
        }

        double fine = calculateFine(days);
        System.out.println("Total fine: " + fine);
    }

    public static double calculateFine(int days) {
        double fine = 0;

        if (days <= 7) {
            fine = days * 0.50;
        } else if (days <= 14) {
            fine = 7 * 0.50 + (days - 7) * 1.0;
        } else {
            fine = 7 * 0.50 + 7 * 1.0 + (days - 14) * 5.0;
        }

        return fine;
    }
}
