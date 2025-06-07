import java.util.*;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius of circle");
        float radius = sc.nextFloat();
        // double nu = 3.14;
        // System.out.println(nu);
        float area = (3.14f) * radius * radius;
        System.out.print("area of circle is ");
        System.out.println(area);

    }
}
