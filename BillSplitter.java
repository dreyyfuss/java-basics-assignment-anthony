import java.util.Arrays;
import  java.util.Scanner;

public class BillSplitter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total bill: ");
        float bill = scanner.nextFloat();
        System.out.print("Enter number of people: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter split ratio: ");
        String ratio = scanner.nextLine();

        int [] rations = parse_ratio(ratio);
        if (rations.length != n) {
            System.out.println("Invalid ratio");
            return;
        }

        float final_bill = get_final_bill(bill);

        int sum = Arrays.stream(rations).sum();
        for (int i = 0; i < n; i++) {
            float payment = rations[i] / (float) sum * final_bill;
            System.out.println("Person " + i + ": ₦" + payment);
        }
    }

    public static float get_final_bill(float bill) {
        if (bill < 50) {
            return bill * 1.1f;
        }
        else if (bill <= 100) {
            return bill * 1.15f;
        }
        else {
            return bill * 1.2f;
        }
    }

    public static int[] parse_ratio(String ratio) {
        String[] parts = ratio.split(":");
        int [] res = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            if (!part.chars().allMatch(c -> Character.isDigit(c))) {
                return new int[0];
            }
            else {
                res[i] = Integer.parseInt(part);
            }
        }
        return res;
    }
}
