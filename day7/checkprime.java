import java.util.*;

public class checkprime {

    public static boolean isprime(int a) {

        for (int i = 2; i <= Math.sqrt(a); i++) {

            if (a % i == 0) {
                return false;

            }

        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isprime(22));

    }
}
