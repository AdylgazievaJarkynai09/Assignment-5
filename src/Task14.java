import java.util.Scanner;

public class Task14 {

    static int[] readArray(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    static void reverse(int[] a, int from, int to) {
        while (from < to) {
            int tmp = a[from];
            a[from] = a[to];
            a[to] = tmp;
            from++;
            to--;
        }
    }

    static void shiftRight(int[] a, int k) {
        int n = a.length;
        k = ((k % n) + n) % n;
        if (k == 0) {
            return;
        }
        reverse(a, 0, n - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, n - 1);
    }

    static void printArray(int[] a) {
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
        int[] a = readArray(sc);
        int k = sc.nextInt();
        shiftRight(a, k);
        printArray(a);
    }
}