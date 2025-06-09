import java.util.*;

public class sumoffirstnnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 1;
        int sum = 0;
        int end = sc.nextInt();
        while (start <= end) {
            sum = sum + start;
            start++;

        }
        System.out.println(sum);
        sc.close();

    }

}
