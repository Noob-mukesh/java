import java.util.Scanner;

public class quest2 {
    public static void main(String[] args) {
        // Write a program that reads a set of integers, and then prints the sum of the
        // even and odd integers.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int even = 0;
        int odd = 0;

        for (int i = 0; i < 100; i = i + 1) {

            if (i % 2 == 0) {
                even += i;

            } else {
                odd += i;
                // System.out.println(odd);

            }

        }
        System.out.print(odd + " " + even);

    }
}
