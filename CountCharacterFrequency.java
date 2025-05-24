import java.util.Scanner;
import java.util.HashMap;

public class CountCharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> counts = new HashMap<>();

        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        for (Character c: input.toCharArray()) {
            if (counts.containsKey(c)) {
                Integer i = counts.put(c, counts.get(c) + 1);
            }
            else {
                counts.put(c, 1);
            }
        }

        System.out.println("The frequencies of characters are: "+counts);
    }
}
