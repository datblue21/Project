import java.util.Scanner;

public class câu3 {
    public static void main(String[] args) {
        Scanner key= new Scanner(System.in);
        System.out.print("side of triangle: ");
        int n = key.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
