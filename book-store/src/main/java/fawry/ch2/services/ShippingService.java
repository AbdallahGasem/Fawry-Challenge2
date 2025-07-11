//                                                      بسم الله الرحمن الرحيم                                                 //
// Program: ShippingService.java
// Description: 
// Author: Abdallah Gasem
// Date: 08-07-2025
// Version: 1.0
/* File run command: javac ShippingService.java; java ShippingService */
// ----------------------------------------------------------------------------------------------------------------------------- //
package fawry.ch2.services;

import fawry.ch2.categories.PaperBook;

public class ShippingService {

    public void ship(PaperBook book) {
        System.out.println("** Shippment Notice **");
        System.out.println("Shipping " + book.getTitle() + " of weight " + book.getWeight());
    }

}
