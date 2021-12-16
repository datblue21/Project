import java.util.Scanner;

public class câu5 {
    public static void main(String[] args) {

        int height;
        int i;
        Scanner key = new Scanner(System.in);

        System.out.print("height = ");
        height = key.nextInt();

        for(i = 1; i <= height; i++) {
            for(int j = 1; j <= height-i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= 2*i-1; k++) {
                if(k == 1 || k == 2*i-1 || i == height) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
