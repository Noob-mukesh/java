import java.util.*;

public class quest4 {
    public static void main(String[] args) {
        // Write a program to print the multiplication table of a number N, entered by
        // the user
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number whose multiplication table u want to: ");
        int num = sc.nextInt();

        for (int j = 1; j <= 10; j++) {
            System.out.println(num + " * " + j + " = " + num * j);

        }
        sc.close();
    }
}
