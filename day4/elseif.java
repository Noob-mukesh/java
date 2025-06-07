import java.util.*;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("adult : vote,drive");

        } else if (age > 13 && age < 18) {
            System.out.println("teenager");

        } else {
            System.err.println("ur are not adult");

        }
        sc.close();
    }
}
