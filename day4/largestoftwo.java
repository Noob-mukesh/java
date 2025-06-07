import java.util.*;

public class largestoftwo {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();
        int b = SC.nextInt();
        if (a > b) {
            System.out.println(a + "is largest than" + b);

        } else {
            System.out.println(b + " is largest than " + a);

        }
    }

}
