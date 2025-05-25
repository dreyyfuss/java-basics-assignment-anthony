import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial:");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number: The number must be greater than zero.");
        }
        else {
            System.out.println("The factorial of "+n+" is "+factorial(n));
        }
    }

    public static long factorial(int n) {
        long res = 1;
        for (int i = n; i > 0; i--) {
            res *= i;
        }

        return res;
    }
}
