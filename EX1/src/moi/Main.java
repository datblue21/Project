package moi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char ch;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input a character: ");
        ch = keyboard.next().charAt(0);
        System.out.println("AsCII OF " + ch + " is " +(byte)ch);
    }
}