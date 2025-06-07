import java.util.*;

public class calculatorswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number ");
        int a = sc.nextInt();
        System.err.print("enter second number ");
        int b = sc.nextInt();
        System.out.print("enter operator such as +-*/%");
        char operator = sc.next().charAt(0);
        int sol;
        switch (operator) {
            case '+':
                sol = (int) (a + b);
                System.out.println(sol);
                break;
            case '-':
                sol = (int) (a - b);
                System.out.println(sol);
                break;
            case '*':
                sol = (int) (a * b);
                System.out.println(sol);
                break;
            case '/':
                sol = (int) (a / b);
                System.out.println(sol);
                break;
            case '%':
                sol = (int) (a % b);
                System.out.println(sol);
                break;

            default:
                System.err.println("invalid operator");
                break;

        }
        // System.out.println(sol);

    }
}
