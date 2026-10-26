public class Ninth_Task {
    public static boolean isArmstrong(int n) {
        int f = n / 100;
        int s = (n / 10) % 10;
        int t  = n % 10;
        int sum = (f*f*f) + (s*s*s) + (t*t*t);
        return sum == n;
    }
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
}
