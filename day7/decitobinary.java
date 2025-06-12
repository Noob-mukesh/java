public class decitobinary {
    public static void decitobin(int num) {
        // int ;
        int pow = 0;
        int binnum = 0;
        while (num > 0) {
            int rem = num % 2;
            binnum = binnum + (rem * (int) Math.pow(10, pow));
            pow++;
            num = num / 2;

        }
        System.out.print(binnum);

    }

    public static void main(String[] args) {
        decitobin(5);

    }
}
