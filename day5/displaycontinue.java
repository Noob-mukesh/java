import java.util.*;

public class displaycontinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("please enter number : ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                continue;

            }
            System.out.println("number was " + num);

        } while (true);

    }

}
