package _test2;

//tao lop kiem tra email
public class EmailCheck {
    // @
    // @ khoong o vi tri dau
     public static void check(String str) throws EmailAddressException {
        // kiem tra co @
        int place = str.indexOf('@');
        // neu khong chua @
        if (place == -1) {
            /// nem ra 1 doi tuong Email Address Exception
            throw new EmailAddressException("Email thieu @ nha");
        }
        // Nếu kí tự đầu tiên của chuỗi là @
        if (place == 0)
        {
            throw new EmailAddressException("Khong hop le, @ dau tien");
        }
        // nếu có chứa @, tiếp tục kiểm tra có chứa @ khác không
        place = str.indexOf('@',place+1);
        if(place != -1){
            throw new EmailAddressException("Khong hop, co >1 @");
        }
        // Không rơi vào các trường hợp trên thì địa chỉ hợp lệ
        System.out.println("Dia chi email hop le");
    }
}
