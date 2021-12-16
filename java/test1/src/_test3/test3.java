package _test3;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        try
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap chuoi so nguyen");
            String str = scanner.nextLine();
            // chuyeng string sang integer
            int num = Integer.parseInt(str);
            // hien thi ket qua
            System.out.println(num);
        } catch (NumberFormatException e)
        {
            System.out.println("chuoi nhap chua dung format");
        }
    }
}
