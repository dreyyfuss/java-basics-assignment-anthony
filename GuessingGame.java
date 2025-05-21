import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(1, 51);
        System.out.println("Correct number: " + num);

        for (int i = 0; i < 5; i++) {
            System.out.println("Guess a number between 1 and 50:");
            int guess = scanner.nextInt();
            if (guess > num) {
                System.out.println("Your guess was too high.\n");
            }
            else if (guess < num) {
                System.out.println("Your guess was too low.\n");
            }
            else {
                System.out.println("Your guess was correct!");
                return;
            }
        }
        System.out.println("\n\nGame over! You have run out of chances.\nThe correct number was " + num);
    }
}
