import java.util.*;

public class inputin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input integer
        // int a = sc.nextInt();
        // System.out.print(a);
        // input single word
        // System.out.println("enter your name");
        // String name = sc.next();
        // System.out.print("Your name is ");
        // System.out.println(name);
        // input more than 1 word
        // String data = sc.nextLine();
        // System.out.println(data);
        // input double
        Double num = sc.nextDouble();
        System.out.println(num);
        // nextbyte nextfloat nextboolean nextshort nextlong
        Long num2 = sc.nextLong();
        System.out.println(num2);
        sc.close();
    }
}
