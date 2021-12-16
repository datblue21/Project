package underground;

public class Car {
    //public Object priceForSale;
    private int ID;
    private String name;
    private double price;
    private double extraOut;
    private int quantity;

    public Car(int ID, String name, double price, double extraOut, int quantity) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.extraOut = extraOut;
        this.quantity = quantity;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double priceForSale() {
        double total = 0.0;
        if (quantity >= 50) {
            total = price + extraOut * 1.1;
        } else total = price + extraOut;
        return total;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", extraOut=" + extraOut +
                ", quantity=" + quantity +
                '}';
    }

}
