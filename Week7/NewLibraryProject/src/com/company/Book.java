package com.company;

public class Book {
    String title;
    boolean borrowed;

    public Book(String title, boolean borrowed) {
        this.title = title;
        this.borrowed = borrowed;
    }

    // Creates a new Book
    public Book(String bookTitle) {
        title = bookTitle;
        borrowed = false;
    }

    // Marks the book as rented
    public void rented() {
        borrowed = true;
    }

    // Marks the book as not rented
    public void returned() {
        borrowed=false;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        return this.borrowed;
    }

    // Returns the title of the book
    public String getTitle() {
        return title;
    }

}
