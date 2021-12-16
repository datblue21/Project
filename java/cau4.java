import java.util.Scanner;

public class cau4 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("height of triangle: ");
        int n = key.nextInt();
        int k = 0;
        for (int i = 1; i <= n; i++, k = 0) {
            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print("  ");
            }
            while (k != i*2 - 1) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }
    }
}
