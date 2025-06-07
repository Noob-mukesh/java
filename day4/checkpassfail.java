import java.util.*;

public class checkpassfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks in integer:");
        int num = sc.nextInt();
        int pass = 33;
        // if (num >= pass) {
        // System.out.println("passed");

        // } else {
        // System.out.println("failed");

        // }
        String passes = (num >= 33) ? "Passed" : "Failed";
        System.out.println(passes);

    }

}
