import java.util.Scanner;
public class First_Task {
    public static void printStrip(int n, char symbol) {
        for (int i = 0; i < n; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int a = vvod.nextInt();
        printStrip(a, '#');
    }
}