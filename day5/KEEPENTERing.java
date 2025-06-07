import java.util.*;

public class KEEPENTERing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        // while (num % 10 != 0) {
        // System.out.println(num);
        // num = sc.nextInt();

        // }
        // System.out.println("loop end");
        do {
            System.out.print("enter your number :");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                System.out.println("loop ended");
                break;

            }
            System.out.println(num);

        } while (true);

    }
}
