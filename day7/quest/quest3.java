import java.util.*;

public class quest3 {
    // Write a Java program to check if a number is a palindrome in Java? ( 121 is a
    // palindrome,321 is not) A number is called a palindrome if the number is equal
    // to the reverse of a number e.g.,121 is a palindrome because the reverse of
    // 121 is 121 itself. On the other hand,321 is not a palindrome because the
    // reverse of 321 is 123, which is not equal to 321
    public static void isPalindrome(int num) {
        int orignalnum = num;
        int palindrome = 0;
        while (num > 0) {
            int remind = num % 10;
            num = num / 10;
            palindrome = palindrome * 10 + remind;

        }

        System.out.print(palindrome == orignalnum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        isPalindrome(num);

    }
}
