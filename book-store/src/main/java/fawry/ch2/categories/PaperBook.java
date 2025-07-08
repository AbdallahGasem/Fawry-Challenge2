//                                                      بسم الله الرحمن الرحيم                                                 //
// Program: PaperBook.java
// Description: 
// Author: Abdallah Gasem
// Date: 08-07-2025
// Version: 1.0
/* File run command: javac PaperBook.java; java PaperBook */
// ----------------------------------------------------------------------------------------------------------------------------- //
package fawry.ch2.categories;

import fawry.ch2.base.Book;
import fawry.ch2.interfaces.Purchasable;
import fawry.ch2.interfaces.Shippable;

public class PaperBook extends Book implements Shippable, Purchasable {

    // Data
    private Double price;
    private Integer availQty;

    // Setters and Getters
    public Double getPriceValue() {
        return price;
    }

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
    public String getName() {
        return "";
    }

    @Override
    public Double getPrice() {
        return 0.0;
    }

    @Override
    public Double getWeight() {
        return 0.0;
    }
}
