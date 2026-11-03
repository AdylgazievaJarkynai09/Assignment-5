import java.util.Scanner;

public class Task2 {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (isEven(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
