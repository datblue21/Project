
import java.util.Scanner;

public class cau2 {
    public static void main(String[] args) {
        Scanner key= new Scanner(System.in);
        System.out.print("a= ");
        int a= key.nextInt();
        System.out.print("b= ");
        int b= key.nextInt();

       // boi chung
        for (int i=1; i>=1; i++){
            if (i%a==0 && i%b==0){
                    System.out.println("boi chung nn a&b: " + i);
                    break;
                }
        }

        //uoc chung
        int gcd = 0;
        for (int j=1; j<=a && j<=b ; j++){
            if (a%j==0 && b%j==0){
                gcd= j;
            }
        }
            System.out.println("uoc chung lon nhat a&b: "+ gcd);

    }
}