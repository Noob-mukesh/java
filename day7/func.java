import java.util.Scanner;

public class func {
    public static void helloworld() {
        System.out.println("hello world");
    }

    public static int calculatesum(int num1, int num2) { // params (formal)
        int sum = num1 + num2;

        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a, b); // arguments(acutal params)
        System.out.println("sum of number is :" + sum);
        sc.close();

    }
}
