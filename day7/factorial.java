import java.util.*;

public class factorial {
    public static int fact(int a) {

        int fact = 1;
        for (int index = 1; index <= a; index++) {
            fact *= index;

        }
        return fact;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any postive number: ");
        int num = sc.nextInt();
        System.out.println("factorial is " + fact(num));
        sc.close();

    }
}
