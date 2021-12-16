//
//import _test2.EmailAddressException;
//
//public class EmailCheck {
//    public static void check(String str) throws EmailAddressException {
//        // biểu thức chính quy so khớp địa chỉ email
//        String emailreg = "^[\\w-]+@([\\w- ]+\\.)+[\\w-]+$";
//        // so khớp địa chỉ email với biểu thức chính qui
//        Boolean b = str.matches(emailreg);
//        //nếu không khớp biểu thức chính qui thì sinh ra lỗi
//        if (b == false) throw new EmailAddressException("dia chi email khong hop le");
//    }
//}
