import java.util.*;

public class fstquest {
    public static void main(String[] args) {
        // Question 1 : Write a Java program to get a number from the user and print
        // whether it is
        // positive or negative.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int num = sc.nextInt();

        if (num < 0) {
            System.err.println("number is negative");
        }

        else {
            System.out.println("num is positive");

        }
        sc.close();

    }
}
