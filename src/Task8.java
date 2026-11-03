import java.util.Scanner;

public class Task8 {

    static long[] readArray(Scanner sc) {
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        return a;
    }

    static void swapNeighbors(long[] a) {
        for (int i = 0; i + 1 < a.length; i += 2) {
            long tmp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = tmp;
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
        swapNeighbors(a);
        printArray(a);
    }
}