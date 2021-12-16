package com.company;

//import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Author[] authors = new Author[3];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
//        authors[2] = new Author("Satoshi", "LOEO@nowhere.com", 'm');
//        for (int i = 0; i < authors.length; i++) {
//            System.out.print("Enter the name of author " + (i + 1) + ": ");
//            System.out.println(authors[i]);
//        }
        Book javaDummy = new Book("Java for Dummy", new Author[]{authors[2]}, 19.99, 99);
        System.out.println(javaDummy);
    }
}
