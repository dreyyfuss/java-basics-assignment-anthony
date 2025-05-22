import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        try {
            int decimal = Integer.parseInt(binary, 2);
            System.out.println("Decimal number: " + decimal);
        }
        catch (NumberFormatException e) {
            System.err.println("Invalid binary number: " + e.getMessage());
        }
    }
}
