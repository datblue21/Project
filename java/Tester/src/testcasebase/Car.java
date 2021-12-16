package testcasebase;

import java.util.Scanner;
public class Car {

    private int id;
    private String name;
    private int quantity;
    private double price;
    private double extraOut;


    public Car() {

    }


    public Car(int id , String name,int quantity,double price,double extraOut) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = extraOut ;
        this.extraOut = extraOut;
    }


    //
    void nhap()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("ID CAR: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.print("NAME CAR: ");
        name = scan.nextLine();
        System.out.print("QUANTITY: ");
        quantity = scan.nextInt();
        System.out.print("PRICES CAR: ");
        price = scan.nextDouble();
        System.out.print("EXTRAOUT: ");
        extraOut = scan.nextDouble();


    }

    //void
    void xuat() {
        System.out.printf("\n%15d|",id);
        System.out.printf("%15s|",name);
        System.out.printf("%15d|",quantity);
        System.out.printf("%15.2f|",price);
        System.out.printf("%15.2f|",extraOut);
        System.out.printf("%15.2f|",priceForSale());
    }



    // Tính giá bán xe ô tô
    double priceForSale() {
        double priceForSa = 0;
        if(quantity >=50)
        {
            priceForSa = extraOut*0.1 + price;
        }
        else {
            priceForSa = extraOut + price;
        }
        return priceForSa;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getQuantity() {
        return quantity;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public double getExtraOut() {
        return extraOut;
    }


    public void setExtraOut(double extraOut) {
        this.extraOut = extraOut;
    }

}

