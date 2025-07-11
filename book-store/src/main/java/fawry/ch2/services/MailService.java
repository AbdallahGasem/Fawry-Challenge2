//                                                      بسم الله الرحمن الرحيم                                                 //
// Program: MailService.java
// Description: 
// Author: Abdallah Gasem
// Date: 08-07-2025
// Version: 1.0
/* File run command: javac MailService.java; java MailService */
// ----------------------------------------------------------------------------------------------------------------------------- //
package fawry.ch2.services;

import fawry.ch2.categories.EBook;

public class MailService {

    public void mailto(String mail, EBook book) {
        System.out.println("** Mail Notice **");
        System.out.println("Mail Sent to " + mail + " Including Book: " + book.getTitle() + " of file type: " + book.getFileType());
    }
}
