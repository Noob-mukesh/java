import java.util.*;

public class primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isprime = true;

        // for (int i = 2; i <= num - 1; i++) {
        // if (num % 2 == 0) {
        // isprime = false;
        // }
        // }
        // if (isprime) {
        // System.out.println("n is prime");

        // } else {
        // System.out.println("n is not prime");

        // }
        if (num == 2) {
            System.out.println("n is prime no");

        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % 2 == 0) {
                    isprime = false;
                }
            }
            if (isprime) {
                System.out.println("n is prime");

            } else {
                System.out.println("n is not prime");

            }

        }

    }
}
