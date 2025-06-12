import java.util.*;

public class printprime {

    public static boolean isprime(int a) {

        for (int i = 2; i <= Math.sqrt(a); i++) {

            if (a % i == 0) {
                return false;

            }

        }

        return true;
    }

    public static void primerange(int num) {
        for (int index = 2; index <= num; index++) {
            if (isprime(index)) {
                System.out.println(index);
            }

        }

    }

    public static void main(String[] args) {
        int n = 20;

        primerange(n);

    }
}
