import java.util.*;

public class typeconversion {
    public static void main(String[] args) {
        // typeconversion.java:4: error: incompatible types: possible lossy conversion
        // from float to int
        int a = 100;
        double b = a;
        System.out.println(b);
        Scanner sc = new Scanner(System.in);
        float x = sc.nextInt();
        System.out.println(x);

        // float a = 5.0f;
        // int b = a;
        // System.out.println(b);

    }
}
