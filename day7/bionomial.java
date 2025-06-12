
public class bionomial {
    public static int fact(int a) {

        int fact = 1;
        for (int index = 1; index <= a; index++) {
            fact *= index;

        }
        return fact;

    }

    public static void bionomialcoffiecient(int a, int b) {
        // nCr=N!/(R!(N-R))!

        System.out.println(fact(a) / (fact(b) * fact(a - b)));

    }

    public static void main(String[] args) {
        bionomialcoffiecient(5, 2);

    }

}
