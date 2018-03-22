package com.github.javapedia.objects.book;

public class Book {

    private String title;
    private Author author;
    private Author[] multipleAuthors;
    private boolean moreThanOneAuthor;
    private float price;
    private int inStock;

    public Book(String title, Author author, float price, int inStock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.inStock = inStock;
        moreThanOneAuthor = false;
    }

    public Book(String title, Author[] multipleAuthors, float price, int inStock) {
        this.multipleAuthors = multipleAuthors;
        this.title = title;
        this.price = price;
        this.inStock = inStock;
        moreThanOneAuthor = true;
    }

    public void displayAllData() {

        if (moreThanOneAuthor) {
            System.out.print("Book title: " + title + "\n" + "Authors: ");
            for (Author multipleAuthor : multipleAuthors) {
                System.out.print(multipleAuthor.getFullName() + ", ");
            }
            System.out.print("\nPrice: " + price + "\nAvailable: " + inStock);
        } else
            System.out.print("Book title: " + title + "\n" + "Authors: " + author.getFullName() + "\n" + "Price: " + price + "\nAvailable: " + inStock);

    }
}
