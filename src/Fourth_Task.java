import java.util.Scanner;
public class Fourth_Task {
    public static void printMatrix(int n, int m) {
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int m = vvod.nextInt();
        printMatrix(n, m);
    }
}