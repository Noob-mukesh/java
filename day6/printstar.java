import java.util.*;

public class printstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int line = 1; line <= num; line++) {
            // System.out.print("*");
            for (int star = 1; star <= line; star++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
