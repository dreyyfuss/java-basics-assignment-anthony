import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        System.out.println("The sentence has " + words.length + " words.");
    }
}
