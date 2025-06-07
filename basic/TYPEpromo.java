public class TYPEpromo {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println(b - a);
        int num = 10;
        byte by = 10;
        char c = 'c';
        // typecasting
        System.out.println((int) (c));
        // typepromo to int
        int expression = num * by + c;
        System.out.println(expression);
        float g = 10.80f;
        double d = 10.50;
        int e = 10;
        long f = 100000;
        // expression type promo to double
        double sol = d + e + f - g;
        System.out.println(sol);

    }
}
