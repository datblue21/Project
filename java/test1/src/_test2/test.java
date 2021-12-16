package _test2;

import java.util.Scanner;
import java.lang.String;

import static _test2.EmailCheck.check;

public class test {
    public static void main(String[] args){
    try {
        // Nhập chuỗi vào (điạ chỉ email)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap dia chi email vao");
        String email = scanner.nextLine();
        // Gọi hàm check để kiểm tra, vì hàm throws ra đối tượng Exception
        // nên phải gọi trong try catch
        check(email);
    }
    catch (EmailAddressException e)
    {
        // nếu địa chỉ email khong hợp lệ thì hàm catch ném ra đối tượng
        // EmailAddressException và khối catch bắt lấy và thực thi
        System.out.println("e.getMessage");
    }
    }
}
