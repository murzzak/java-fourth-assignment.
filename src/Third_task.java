import java.util.Scanner;
public class Third_task {
    public static void printInvertedPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            }
            for (int k = 0; k < 2 * (n - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt(); // Например, вводим 3
        printInvertedPyramid(n);
    }
}