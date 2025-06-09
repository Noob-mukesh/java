public class charpattern {
    public static void main(String[] args) {
        // char a = 'J';
        // int b = a;
        // System.out.println((int) a);
        // System.out.println((char) b);
        char a = 'A';
        for (int i = 0; i <= 4; i++) {
            // System.out.println((char) i);
            for (int chars = 1; chars <= i; chars++) {
                System.out.print(a);
                a++;

            }
            System.out.println();
        }

    }
}
