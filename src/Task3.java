import java.util.Scanner;

public class Task3 {

    static int countPositive(long[] a) {
        int count = 0;
        for (long x : a) {
            if (x > 0) {
                count++;
            }
        }
        return count;
    }

    static long[] readArray(Scanner sc) {
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = readArray(sc);
        System.out.println(countPositive(a));
    }
}