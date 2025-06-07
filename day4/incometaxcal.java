import java.util.*;

public class incometaxcal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER your income in integer format : ");
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = (int) income * 0;

        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);

        } else {
            tax = (int) (income * 0.3);

        }
        System.out.println("u have to pay amount " + tax + " tax");

    }
}
