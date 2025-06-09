import java.util.*;

public class reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number you want to reverse: ");
        int num = sc.nextInt();
        int newnum;
        int reverse = 0;
        while (num > 0) {
            newnum = num % 10;
            num = num / 10;
            reverse = (reverse * 10) + newnum;

            // System.out.print(reverse);

        }
        System.out.println(reverse);
        sc.close();
    }
}
