package newpackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vector2D vector1 = new Vector2D(-1, 2);
        Vector3D vector2 = new Vector3D(6, 8, 10);
        System.out.println("chieu dai cua vector 2D: " + vector1.evalModule());
        System.out.println("chieu dai cua vector 3D: " + vector2.evalModule());
        System.out.println(vector1.isPerp(2, 1));
        System.out.println(vector2.isPerp(7, 8, -10));
//        int m;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number of elements you will enter");
//        m = sc.nextInt();
//        Vector2D vector[] = new Vector2D[m];
//        for(int i = 0; i < m; i++){
//            Vector2D[i] = sc.next();
//        }
    }
}
