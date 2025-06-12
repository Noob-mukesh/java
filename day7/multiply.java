import java.util.Scanner;

public class multiply {
    public static int mult(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = mult(a, b);
        System.out.println("product of numbers is " + product);
        sc.close();
    }
}
