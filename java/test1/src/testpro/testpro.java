package testpro;

import java.util.Scanner;

public class testpro {

    public static void main(String[] args) {
        int i =10;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("nhap j");
            int j = scanner.nextInt();
            try {
                System.out.println(i / j);
                break;
            } catch (ArithmeticException ex){
                System.out.println("Dat...");
            }
        }
    }
}

