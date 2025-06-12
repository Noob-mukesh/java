
public class quest2 {
    // Write a method named isEven that accepts an int argument. The method should
    // return true ifthe argument is even, or false otherwise. Also write a program
    // to test your method
    public static void isEven(int a) {
        if (a % 2 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static void main(String[] args) {
        isEven(10);
        isEven(15);

    }
}
