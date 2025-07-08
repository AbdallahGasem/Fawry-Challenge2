//                                                      بسم الله الرحمن الرحيم                                                 //
// program: PurshasingService.cpp 
// Description: 
// Author:  Abdallah Gasem
// Date: 08-07-2025
// Version: 1.0
// ----------------------------------------------------------------------------------------------------------------------------- //
package fawry.ch2.services;

import fawry.ch2.base.Book;
import fawry.ch2.base.Inventory;
import fawry.ch2.categories.EBook;
import fawry.ch2.categories.PaperBook;
import fawry.ch2.categories.ShowCaseBook;

public class PurshasingService {

    private ShippingService shippingService;
    private MailService mailService;
    private Inventory inventory;

    public PurshasingService(ShippingService shippingService, MailService mailService, Inventory inventory) {
        this.shippingService = shippingService;
        this.mailService = mailService;
        this.inventory = inventory;
    }

    public boolean buy(String ISBN, Integer qty, String mail, String address) throws Exception {

        Double price = 0.0;

        // want to search for that book if available
        Book book = inventory.getBookByISBN(ISBN);
        if (book == null) {
            System.err.println("Book with ISBN '" + ISBN + "' not found in Inventory!");
            System.err.println("Purchasing Failed!");
            return false;
        }

        // if it is a Demo book exit
        if (book instanceof ShowCaseBook) {
            System.err.println("Book: '" +book.getTitle() + "'' is not for sale!");
            return false;
        }

        // if found check the qty before finalyizing - what is only a portion of the qty is available? ask the user !
        // if the book is shippable send to the shipping service
        if (book instanceof PaperBook) {
            PaperBook pb = (PaperBook) book;
            if (pb.getAvailQty() >= qty) {

                // update the quantity of the stock
                pb.setAvailQty(pb.getAvailQty() - qty);

                // ship
                shippingService.ship(pb);

                price = pb.getPrice();
            } else {
                throw new Exception("Un Suffiecient Quantity of Book: " + book.getTitle());
            }

        }

        // if the book is is not use to the Mail service
        if (book instanceof EBook) {
            EBook eb = (EBook) book;
            mailService.mailto(mail, eb);   // bas lsa madaf3sh??
            price = eb.getPrice();
        }

        // checkout
        System.out.println("-----------------------------------------------------");
        System.out.println(" Paid Amount: " + price);

        return true;
    }

}
