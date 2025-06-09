import java.util.*;

public class printnumton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter last no to where u want to print : ");
        int num = sc.nextInt();
        int start = 1;
        while (start <= num) {
            System.out.print(start + " ");
            start++;

        }
        sc.close();

    }
}
