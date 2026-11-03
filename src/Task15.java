import java.util.Scanner;

public class Task15 {

    static int[] readArray(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    static int findChainStart(int[] a, int len) {
        int i = 0;
        while (i < len) {
            int j = i;
            while (j < len && a[j] == a[i]) {
                j++;
            }
            if (j - i >= 3) {
                return i;
            }
            i = j;
        }
        return -1;
    }

    static int chainLength(int[] a, int len, int start) {
        int j = start;
        while (j < len && a[j] == a[start]) {
            j++;
        }
        return j - start;
    }

    static int countDestroyed(int[] a) {
        int len = a.length;
        int destroyed = 0;
        while (true) {
            int start = findChainStart(a, len);
            if (start == -1) {
                break;
            }
            int size = chainLength(a, len, start);
            for (int i = start + size; i < len; i++) {
                a[i - size] = a[i];
            }
            len -= size;
            destroyed += size;
        }
        return destroyed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = readArray(sc);
        System.out.println(countDestroyed(a));
    }
}