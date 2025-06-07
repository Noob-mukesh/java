import java.util.*;

public class THIRDQU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a Java program to input week number(1-7) and print day of week name
        // using switch case.
        System.out.print("please enter week number to get day name:");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thrusday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;

            default:
                System.out.println("invaild day no input within 1-7");
                break;
        }
    }

}
