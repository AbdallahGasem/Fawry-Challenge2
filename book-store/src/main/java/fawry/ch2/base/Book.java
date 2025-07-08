//                                                      بسم الله الرحمن الرحيم                                                 //
// Program: Book.java
// Description: 
// Author: Abdallah Gasem
// Date: 08-07-2025
// Version: 1.0
/* File run command: javac Book.java; java Book */
// ----------------------------------------------------------------------------------------------------------------------------- //
package fawry.ch2.base;

import java.time.Year;

public abstract class Book {

    private String ISBN;
    private String title;
    private Year yearPublished;

    public Book(String ISBN, String title, Year yearPublished) {
        this.ISBN = ISBN;
        this.title = title;
        this.yearPublished = yearPublished;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Year getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Year yearPublished) {
        this.yearPublished = yearPublished;
    }

}
