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
    private String Title;
    private Year yearPublished;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Year getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Year yearPublished) {
        this.yearPublished = yearPublished;
    }

}
