
public class quest5 {
    // Write a Java method to compute the sum of the digits in an integer.
    // Question 4]Take a variable sum = 0 b.Find the last digit of the number c.
    // Add it to the sum d. Repeat a& b until the number becomes 0)

    public static void dountilzero(int a) {
        int sum = 0;
        while (a > 0) {
            int digit = a % 10; // Get the last digit
            sum += digit; // Add to sum
            a = a / 10; // Remove the last digit
        }
        System.out.println("Sum of the digits: " + sum);
    }

    public static void main(String[] args) {
        // System.out.println(101 % 10);
        dountilzero(101);

    }

}
