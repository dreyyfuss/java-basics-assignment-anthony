import java.util.Scanner;

public class PanagramChecker {

    public static boolean isPanagram(String sentence) {
        boolean[] seen = new boolean[26];
        sentence = sentence.toLowerCase();

        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }

        for (boolean letterSeen : seen) {
            if (!letterSeen) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        if (isPanagram(input)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is NOT a pangram.");
        }
    }
}
