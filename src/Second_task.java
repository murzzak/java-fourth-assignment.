import java.util.Scanner;
public class Second_task {
    public static void printHollowSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        printHollowSquare(n);
    }
}