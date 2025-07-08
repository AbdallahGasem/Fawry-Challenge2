//                                                      بسم الله الرحمن الرحيم                                                 //
// Program: Inventory.java
// Description: 
// Author: Abdallah Gasem
// Date: 08-07-2025
// Version: 1.0
/* File run command: javac Inventory.java; java Inventory */
// ----------------------------------------------------------------------------------------------------------------------------- //
package fawry.ch2.base;

import java.time.Year;
import java.util.ArrayList;

import fawry.ch2.categories.PaperBook;

public class Inventory {

    private ArrayList<Book> books;

    public Inventory() {
        this.books = new ArrayList<>();
    }

    // get books available
    public ArrayList<Book> getBooks() {
        return this.books;
    }

    // search
    public Book getBookByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }

    // update a Book qty - test darory
    public boolean updateBQty(String ISBN, Integer qty) {

        Book book = getBookByISBN(ISBN);

        if (book == null) {
            System.err.println("Book with ISBN: " + ISBN + " not found in Inventory!");
            return false;
        } else if (book instanceof PaperBook) {
            PaperBook pb = (PaperBook) book;
            pb.setAvailQty(qty);
            return true;
        }

        System.err.println("Book with ISBN: " + ISBN + "of Title: " + book.getTitle() + "IS not a Paper Book to update its Quantity!");
        return false;
    }

    // add 
    public boolean add(Book book) {
        System.out.println("add(" + book.getTitle() + ")");

        // ensure that the book doesnt exist
        if (getBookByISBN(book.getISBN()) == null) {
            books.add(book);
            return true;
        }
        System.err.println("Book: " + book.getTitle() + "of ISBN: "+ book.getISBN() + " Already Exists!");
        return false;
    }

    // remove by ISBN
    public boolean remove(String ISBN) {
        System.out.println("remove(book: " + ISBN + ")");    // to see results in the console
        boolean removed = books.removeIf(book -> book.getISBN().equals(ISBN));
        if (!removed) {
            System.err.println("Book with ISBN '" + ISBN + "' not found in Inventory!");
            return removed;
        }
        System.out.println("Removed book of ISBN: " + ISBN);
        return removed;
    }

    // return outdated before a year
    public ArrayList<Book> refresh(Year criticalYear) {

        ArrayList<Book> outdated = new ArrayList<>();

        for (Book book : books) {
            if (book.getYearPublished().isBefore(criticalYear)) {
                outdated.add(book);
            }
        }

        for (Book book : outdated) {
            System.out.println("Removing: " + book.getTitle());
            remove(book.getISBN());
        }

        return outdated;

    }

    // overloading to return outdated by a number of years
    public ArrayList<Book> refresh(Integer years) {

        ArrayList<Book> outdated = new ArrayList<>();

        for (Book book : books) {

            int currentYear = Year.now().getValue();
            int publishedYear = book.getYearPublished().getValue();
            if (currentYear - publishedYear >= years) {
                outdated.add(book);
            }
        }

        for (Book book : outdated) {
            System.out.println("Removing: " + book.getTitle());
            remove(book.getISBN());
        }

        return outdated;

    }
}
