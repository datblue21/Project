package test33;

import java.util.Scanner;

public class CheckNumber {
    public static void checkNumber(String s) throws UnsignedIntegerException {
        //định dạng chuỗi số nguyên
        String numReg = "^\\d+$";
        //so khớp chuỗi với biểu thức chính quy
        Boolean b = s.matches(numReg);
        //nếu không khớp thì ném ra đối tượng UnsignIntegerException
        if (b == false) throw new UnsignedIntegerException("dinh dang chuoi so khong hop le");

    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap chuoi so nguye duong: ");
            String numStr = scanner.nextLine();
            // gọi hàm checknumber nếu lỗi thì sinh ra dối tượng lỗi
            // do đó nó được goi trong khối try catch
            checkNumber(numStr);
        } catch (UnsignedIntegerException e) {
            // nếu lối ném ra từ checknumber thì CATCH được thực thi
            System.out.println(e.getMessage());
        }
    }
}
