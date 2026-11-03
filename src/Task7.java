import java.util.Scanner;

public class Task7 {

    static long[] readArray(Scanner sc) {
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        return a;
    }

    static void reverse(long[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            long tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;
        }
    }

    static void printArray(long[] a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(a[i]);
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = readArray(sc);
        reverse(a);
        printArray(a);
    }
}