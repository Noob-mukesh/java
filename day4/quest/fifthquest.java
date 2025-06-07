import java.util.*;

public class fifthquest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 5 : Write a Java program that takes a year from the user and print
        // whether that
        // year is a leap year or not.
        System.out.println("enter any year to check leap year or not");
        int year = sc.nextInt();
        // System.out.println(year / 100);
        if ((year % 4 == 0)) {

            if (year % 100 == 0) {

                if (year % 400 == 0) {
                    System.out.println("leap year");
                } else {
                    System.out.println("not a leap year");
                }
            }

            else {
                System.out.println("leap year");

            }

        } else {
            System.out.println("not a leap year");
        }

    }

}
