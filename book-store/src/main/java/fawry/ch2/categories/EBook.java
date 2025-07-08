//                                                      بسم الله الرحمن الرحيم                                                 //
// Program: EBook.java
// Description: 
// Author: Abdallah Gasem
// Date: 08-07-2025
// Version: 1.0
/* File run command: javac EBook.java; java EBook */
// ----------------------------------------------------------------------------------------------------------------------------- //
package fawry.ch2.categories;

import java.time.Year;

import fawry.ch2.base.Book;
import fawry.ch2.interfaces.Purchasable;

public class EBook extends Book implements Purchasable {

    private Double price;
    private String fileType;

    public EBook(String ISBN, String title, Year yearPublished, Double price, String fileType) {
        super(ISBN, title, yearPublished);
        this.fileType = fileType;
        this.price = price;
    }

    // setters and getters
    public void setPrice(Double price) {
        this.price = price;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFType(String fileType) {
        this.fileType = fileType;
    }

    // Traits
    @Override
    public Double getPrice() {
        return price;
    }
}
