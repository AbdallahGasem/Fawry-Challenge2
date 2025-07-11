//                                                      بسم الله الرحمن الرحيم                                                 //
// Program: Main.java
// Description: 
// Author: Abdallah Gasem
// Date: 08-07-2025
// Version: 1.0
/* File run command: javac Main.java; java Main */
// ----------------------------------------------------------------------------------------------------------------------------- //
package fawry.ch2;

import java.time.Year;

import fawry.ch2.base.Book;
import fawry.ch2.base.Inventory;
import fawry.ch2.categories.EBook;
import fawry.ch2.categories.PaperBook;
import fawry.ch2.categories.ShowCaseBook;
import fawry.ch2.services.MailService;
import fawry.ch2.services.PurshasingService;
import fawry.ch2.services.ShippingService;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nHello world! Fawry challenge 2\n");

        // pre
        ShippingService shippingService = new ShippingService();
        MailService mailService = new MailService();
        Inventory inventory = new Inventory();
        PurshasingService purshasingService = new PurshasingService(shippingService, mailService, inventory);

        // make some books to add them to the inventory
        Book shakespere = new PaperBook("1000", "shakespere", Year.of(1800), 2500.0, 1.0, 3);
        Book shakespere2 = new PaperBook("1001", "shakespere2", Year.of(1800), 2500.0, 1.0, 0);
        Book thinkLikeaProgrammer = new EBook("2000", "Think Like a Programmer", Year.of(2020), 600.0, "pdf");
        Book Demo = new ShowCaseBook("3000", "Demo for Toy Story", Year.of(2016));
        Book Demo2 = new ShowCaseBook("3001", "Demo for Transformers", Year.of(2013));
        Book Demo3 = new ShowCaseBook("3002", "Demo Demo", Year.of(2010));

        // Load the inventory
        inventory.add(shakespere);
        inventory.add(shakespere2);
        inventory.add(thinkLikeaProgrammer);
        inventory.add(Demo);
        inventory.add(Demo2);
        inventory.add(Demo3);

        //--------------------------------------------------------[Existing Book]------------------------------------------------//
        // // trying to add an existing book to the inventory
        // System.out.println("Add Existing Book to the Inventory:\n");
        // inventory.add(Demo);

        // // //--------------------------------------------------------[Removing Book]------------------------------------------------//
        // // normal remove 
        // System.out.println("Remove Normally: \n");
        // inventory.remove("3000");

        // // removing an item that not exist
        // System.out.println("\nRemove while not exist: \n");
        // inventory.remove("3000");

        // inventory.add(Demo);

        // //------------------------------------------------------[Refresh outdated]-----------------------------------------------//
        // //  refresh the inventory and remove outdated books
        // System.out.println("\n Refreshing the Inventory of the outdated Books: \n");
        // System.out.println("1- Removing books that are relased before 15 years:");
        // inventory.refresh(15); // demo3 aka Demo Demo should be removed
        // System.out.println("\n2- Removing books that are relased before 2015 year:");
        // inventory.refresh(Year.of(2015)); // demo2 aka Demo for Transformers should be removed

        //--------------------------------------------------------[Buy a Book]---------------------------------------------------//
        // // 1- normal buying scenario
        // System.out.println("Normal Buying Scenario of a PaperBook: \n");
        // try {
        //     purshasingService.buy("1000", 1, "ag.ellsayed@gmail.com", "4 Dokki st");
        // } catch (Exception ex) {
        //     ex.printStackTrace();
        // }
        // // 2- then checking the quantity after buying
        // Book book = inventory.getBookByISBN("1000");
        // PaperBook pbb = (PaperBook) book;
        // System.out.println("the quantity after buying 1 copy of " + pbb.getTitle() + " is: " + pbb.getAvailQty()); // there was a 3!

        // normal buying scenario of an Ebook
        // System.out.println("\nNormal Buying Scenario of an EBook: \n");
        // try {
        //     purshasingService.buy("2000", 1, "ag.ellsayed@gmail.com", "4 Dokki st");
        // } catch (Exception ex) {
        //     ex.printStackTrace();
        // }

        // // try to buy a Demo
        // System.out.println("\ntrying to buy a Demo: \n");
        // try {
        //     purshasingService.buy("3000", 1, "ag.ellsayed@gmail.com", "4 Dokki st");
        // } catch (Exception ex) {
        //     ex.printStackTrace();
        // }

        // // buy a Book of unsuffcient Quantity:
        // System.out.println("\nbuying a Book of unsuffcient Quantity: \n");
        // try {
        //     purshasingService.buy("1001", 2, "ag.ellsayed@gmail.com", "4 Dokki st");
        // } catch (Exception ex) {
        //     ex.printStackTrace();
        // }

        // buy a Book of suffcient portion of Quantity required:
        System.out.println("\nbuying a Book of suffcient portion of Quantity required: \n");
        try {
            purshasingService.buy("1000", 4, "ag.ellsayed@gmail.com", "4 Dokki st");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
