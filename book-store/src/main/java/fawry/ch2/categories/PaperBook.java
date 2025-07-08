//                                                      بسم الله الرحمن الرحيم                                                 //
// Program: PaperBook.java
// Description: 
// Author: Abdallah Gasem
// Date: 08-07-2025
// Version: 1.0
/* File run command: javac PaperBook.java; java PaperBook */
// ----------------------------------------------------------------------------------------------------------------------------- //
package fawry.ch2.categories;

import java.time.Year;

import fawry.ch2.base.Book;
import fawry.ch2.interfaces.Purchasable;
import fawry.ch2.interfaces.Shippable;

public class PaperBook extends Book implements Shippable, Purchasable {

    // Data
    private Double price;
    private Integer availQty;
    private Double weight;

    public PaperBook(String ISBN, String title, Year yearPublished, Double price, Double weight, Integer availQty) {
        super(ISBN, title, yearPublished);
        this.weight = weight;
        this.price = price;
        this.availQty = availQty;
    }

    // Setters and Getters
    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAvailQty() {
        return availQty;
    }

    public void setAvailQty(Integer availQty) {
        this.availQty = availQty;
    }

    /* Traits */
    @Override
    public Double getWeight() {
        return weight;
    }

    @Override
    public Double getPrice() {
        return price;
    }

}
