import java.util.*;

public class quest3 {
    public static void main(String[] args) {
        // Write a program to find the factorial of any number entered by the user.
        // (Hint : factorial of a number n = n * (n-1) * (n-2) * (n-3) * …… * 1 and
        // exists for positive
        // numbers only. We write factorial as n!
        // So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any positive number to find factorial: ");
        int num = sc.nextInt();
        int sum = 1;
        for (int i = num; i >= 1; i--) {
            sum *= i;
            // System.out.println(i);
            // System.out.println(sum);

        }
        System.out.println("factorial : " + sum);
        sc.close();
    }
}
