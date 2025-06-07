
import java.util.*;

public class questsol12 {
    public static void main(String[] args) {
        /*
         * Question 1 : In a program, input 3 numbers : A, B and C. You have to output
         * the average of
         * these 3 numbers.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number ");
        float a = sc.nextFloat();
        System.out.print("Enter 2nd number ");
        float b = sc.nextFloat();
        System.out.print("Enter 3rd number ");
        float c = sc.nextFloat();
        float avg = (a + b + c) / 3;
        System.out.print("average of 3 number is ");
        System.out.println(avg);

        // Question 2: In a program, input the side of a square. You have to output the
        // area of
        // the square.
        System.out.print("Enter side of square");
        float squar = sc.nextFloat();
        float area = squar * squar;
        System.out.print("area of square is ");
        System.out.println(area);

    }
}
