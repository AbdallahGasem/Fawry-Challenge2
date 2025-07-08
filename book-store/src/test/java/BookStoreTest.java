//                                                      بسم الله الرحمن الرحيم                                                 //
// Program: Test.java
// Description: 
// Author: Abdallah Gasem
// Date: 08-07-2025
// Version: 1.0
/* File run command: javac Test.java; java Test */
// ----------------------------------------------------------------------------------------------------------------------------- //

import java.time.Year;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import fawry.ch2.base.Book;
import fawry.ch2.base.Inventory;
import fawry.ch2.categories.PaperBook;
import fawry.ch2.services.MailService;
import fawry.ch2.services.PurshasingService;
import fawry.ch2.services.ShippingService;

public class BookStoreTest {

    // test add book
    @Test
    public void testAddtoInventory() {
        Inventory inventory = new Inventory();
        Book shakespere = new PaperBook("1000", "shakespere", Year.of(1800), 2500.0, 1.0, 3);

        boolean state = inventory.add(shakespere);
        assertTrue(state);
    }

    @Test
    public void testAddanExistingBook() {
        Inventory inventory = new Inventory();
        Book shakespere = new PaperBook("1000", "shakespere", Year.of(1800), 2500.0, 1.0, 3);

        inventory.add(shakespere);
        boolean state = inventory.add(shakespere);
        assertFalse(state);
    }

    // test remove book
    @Test
    public void testRemoveFromInventory() {
        Inventory inventory = new Inventory();
        Book shakespere = new PaperBook("1000", "shakespere", Year.of(1800), 2500.0, 1.0, 3);
        inventory.add(shakespere);

        boolean state = inventory.remove("1000");
        assertTrue(state);

    }

    @Test
    public void testRemoveUnExistingBook() {
        Inventory inventory = new Inventory();
        Book shakespere = new PaperBook("1000", "shakespere", Year.of(1800), 2500.0, 1.0, 3);

        boolean state = inventory.remove("2100");
        assertFalse(state);
    }

    // test buy book
    @Test
    public void testBuyNormalScenario() {
        ShippingService shippingService = new ShippingService();
        MailService mailService = new MailService();
        Inventory inventory = new Inventory();
        PurshasingService purshasingService = new PurshasingService(shippingService, mailService, inventory);

        Book shakespere = new PaperBook("1000", "shakespere", Year.of(1800), 2500.0, 1.0, 3);

        inventory.add(shakespere);
        try {
            boolean state = purshasingService.buy("1000", 1, "ag.ellsayed@gmail.com", "Dokki");
            assertTrue(state);
        } catch (Exception ex) {
        }
    }

    @Test
    public void testBuyWithUnsuffQty() {
        ShippingService shippingService = new ShippingService();
        MailService mailService = new MailService();
        Inventory inventory = new Inventory();
        PurshasingService purshasingService = new PurshasingService(shippingService, mailService, inventory);

        Book shakespere = new PaperBook("1000", "shakespere", Year.of(1800), 2500.0, 1.0, 0);

        inventory.add(shakespere);
        try {
            boolean state = purshasingService.buy("1000", 1, "ag.ellsayed@gmail.com", "Dokki");
            assertFalse(state);
        } catch (Exception ex) {
        }

    }

}
