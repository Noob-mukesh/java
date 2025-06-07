import java.util.*;

public class questsolv {
    public static void main(String[] args) {
        char a = 'a';
        int b = a;
        System.out.println(b);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price of pen ");
        float pen = sc.nextFloat();
        System.out.print("Enter cost price of pencil ");
        float pencil = sc.nextFloat();
        System.out.print("Enter cost price of eraser ");

        float eraser = sc.nextFloat();
        float total = (pen + pencil + eraser) * 1.18f;

        System.out.print("total sell price including 18% gst is ");
        System.out.println(total);

    }
}
