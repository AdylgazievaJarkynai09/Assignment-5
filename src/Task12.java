import java.util.Scanner;

public class Task12 {

    static int[] readArray(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    static int findPlace(int[] a, int petya) {
        int count = 0;
        for (int x : a) {
            if (x >= petya) {
                count++;
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = readArray(sc);
        int petya = sc.nextInt();
        System.out.println(findPlace(a, petya));
    }
}