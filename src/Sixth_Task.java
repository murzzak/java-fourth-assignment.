import java.util.Scanner;
public class Sixth_Task {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int count = 0;
        for (int i = A; i <= B; i++) {
            if (isPrime(i)) {
                count++;
            }
        } System.out.println("Prime Count = " + count);
    }
}