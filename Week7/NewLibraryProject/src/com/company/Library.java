package com.company;

import java.util.ArrayList;

public class Library {

    private String address;
    ArrayList<Book> list;

    public Library(String library) {
        address = library;
        list = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.list.add(book);
    }

    public void printAddress() {
        System.out.println(this.address);
    }

    public void borrowBook(String title) {
        for(Book book : this.list){
            if(title.equals(book.getTitle())){
                if(book.isBorrowed()){
                    System.out.println("Sorry, this book is already borrowed.");
                }else{
                    book.rented();
                    System.out.println("You successfully borrowed " + book.title);
                }
            }
        }
    }

    public void printAvailableBooks() {

    }

    public void returnBook(String the_lord_of_the_rings) {


    }
}
