import java.util.Scanner;

public class Task4 {

    static long[] readArray(Scanner sc) {
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        return a;
    }

    static int countGreaterThanPrevious(long[] a) {
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = readArray(sc);
        System.out.println(countGreaterThanPrevious(a));
    }
}