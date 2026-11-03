import java.util.Scanner;

public class Task5 {

    static long[] readArray(Scanner sc) {
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        return a;
    }

    static boolean hasSameSigns(long[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] * a[i - 1] > 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = readArray(sc);
        System.out.println(hasSameSigns(a) ? "YES" : "NO");
    }
}