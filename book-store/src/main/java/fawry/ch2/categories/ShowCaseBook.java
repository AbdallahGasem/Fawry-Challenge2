//                                                      بسم الله الرحمن الرحيم                                                 //
// Program: ShowCaseBook.java
// Description: 
// Author: Abdallah Gasem
// Date: 08-07-2025
// Version: 1.0
/* File run command: javac ShowCaseBook.java; java ShowCaseBook */
// ----------------------------------------------------------------------------------------------------------------------------- //
package fawry.ch2.categories;

import java.time.Year;

import fawry.ch2.base.Book;

public class ShowCaseBook extends Book {

    public ShowCaseBook(String ISBN, String title, Year yearPublished){
        super(ISBN, title, yearPublished);
    }
}
