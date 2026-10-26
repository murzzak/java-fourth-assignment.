import java.util.Scanner;
public class Eighth_Task {
    public static String decimalToBinary(int n) {
        if (n == 0) {
            System.out.println("Can't be 0");
        }
        String num = "";
        while (n > 0) {
            int remainder = n % 2;
            num = remainder + num;
            n = n / 2;
        }

        return num;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Binary = " + decimalToBinary(n));
    }
}