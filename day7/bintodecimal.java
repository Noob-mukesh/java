import java.util.*;

public class bintodecimal {
    public static void bintodeci(int num) {
        int binnum = num;
        int power = 0;
        int decimal = 0;

        while (num > 0) {
            int lastdigit = num % 10;
            System.out.println(lastdigit);
            decimal = decimal + (lastdigit * (int) Math.pow(2, power));
            power++;
            num = num / 10;

        }
        System.out.println("decimal of " + binnum + " is " + decimal);
    }

    public static void main(String[] args) {
        bintodeci(10);

    }
}
