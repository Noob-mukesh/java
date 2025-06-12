public class callbyvalue {
    public static void Swap(int a, int b) {
        int temp = b;
        b = a;
        a = temp;
        System.out.println("value of a =" + a);
        System.out.println("value of b =" + b);

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        Swap(a, b);
        //
        System.out.println("value of a =" + a);
        System.out.println("value of b =" + b);

    }
}
