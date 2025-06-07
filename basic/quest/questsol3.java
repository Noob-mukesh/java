import java.util.*;

public class questsol3 {

    public static void main(String[] var0) {

        Scanner var3 = new Scanner(System.in);
        System.out.print("Enter cost price of pen ");
        float var4 = var3.nextFloat();
        System.out.print("Enter cost price of pencil ");
        float var5 = var3.nextFloat();
        System.out.print("Enter cost price of eraser ");
        float var6 = var3.nextFloat();
        float var7 = (var4 + var5 + var6) * 1.18F;
        System.out.print("total sell price including 18% gst is ");
        System.out.println(var7);
        var3.close();
    }
}
