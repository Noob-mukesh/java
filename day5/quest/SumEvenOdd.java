import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String input;

        System.out.println("Enter integers (type 'done' to finish):");

        // Reading integers until 'done' is entered
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                numbers.add(Integer.parseInt(input));
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer or 'done' to finish.");
            }
        }

        int evenSum = 0;
        int oddSum = 0;

        // Calculating sums of even and odd integers
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        // Printing results
        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);

        scanner.close();
    }
}
