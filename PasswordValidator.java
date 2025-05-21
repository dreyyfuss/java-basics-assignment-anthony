import java.util.Scanner;
import java.util.stream.Stream;

public class PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the password:");
        String password = scanner.nextLine();

        if (is_valid(password)) {
            System.out.println("Password is valid.");
        }
        else {
            System.out.println("Password is invalid.");
        }
    }

    public static boolean is_valid(String password) {

        boolean valid = true;

        if (password.length() < 8) {
            System.out.println("Password is too short.");
            valid = false;
        }

        if (!password.chars().anyMatch(c -> Character.isUpperCase(c))) {
            System.out.println("No uppercase character.");
            valid = false;
        }

        if (!password.chars().anyMatch((c -> Character.isLowerCase(c)))) {
            System.out.println("No lowercase character.");
            valid = false;
        }

        if (!password.chars().anyMatch((c -> Character.isDigit(c)))) {
            System.out.println("Password has no digit.");
            valid = false;
        }

        return valid;
    }
}
