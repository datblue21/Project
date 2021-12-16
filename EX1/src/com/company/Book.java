package com.company;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qty = 0;
    public Book(String name, Author[] author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public Author[] getAuthor() {
        return author;
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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    String str = Arrays.toString(author);

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" +  Arrays.toString(getAuthor()) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
