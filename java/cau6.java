import java.util.Scanner;

public class cau6 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n= key.nextInt();
        //tam giác trên
        for (int i=1; i<=n;i++){
            for (int j=1; j<i; j++){
                System.out.print(" ");
            }
            for (int k=i; k<=n;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // tam giác dưới
        for (int x=2; x<=n; x++){
            for (int y=x; y<n; y++){
                System.out.print(" ");
            }
            for (int z=1;z<=2*x-1;z++){
                if (z==1 || z==2*x-1 ||x==n ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
