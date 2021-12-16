package sinhvien;

public class testmain {
    public static void main(String[] args) {
        Phan_so phan_so= new Phan_so();
        Phan_so phan_so_1= new Phan_so();
        phan_so.settu_so(3);
        phan_so.setmau_so(4);
        System.out.println("tu so la:" + phan_so.gettu_so());
        System.out.println("mau so la:" + phan_so.getmau_so());
        System.out.println("UCLN la");
        System.out.println(phan_so.UCLN(phan_so.gettu_so(), phan_so.getmau_so()));
        String s = phan_so.toString();
    }
}
